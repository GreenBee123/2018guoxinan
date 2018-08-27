package action;


import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.RequirementDao;

import model.Requirement;
import page.PageInfo;

public class RequirementAction extends ActionSupport {
	// struts action中方法的规范，1.只能是返回String 2 不能有参数，3 必须抛出异常
	// 返回值的的字符串，就是方法执行完毕之后，跳转的下一个页面
	RequirementDao requirementDao;
	Requirement requirement;
	PageInfo pageInfo;

	public RequirementDao getRequirementDao() {
		return requirementDao;
	}

	public void setRequirementDao(RequirementDao requirementDao) {
		this.requirementDao = requirementDao;
	}

	public Requirement getRequirement() {
		return requirement;
	}

	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}

	public RequirementAction() {
		super();
		requirementDao = new RequirementDao();
		pageInfo = new PageInfo();
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public String getAll() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		List<Requirement> requirements = requirementDao.getRequirement(new PageInfo());// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("requirements", requirements);
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pageInfo.isPage = true;
		List<Requirement> requirements = requirementDao.getRequirement(pageInfo);// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("requirements", requirements);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Requirement requirementPO = requirementDao.getById(requirement.getrID());// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("requirement", requirementPO);
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		requirementDao.add(requirement);
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		requirementDao.update(requirement);
		return null;
	}

}