package action;


import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.RequirementDao;

import model.Requirement;
import page.PageInfo;

public class RequirementAction extends ActionSupport {
	// struts action�з����Ĺ淶��1.ֻ���Ƿ���String 2 �����в�����3 �����׳��쳣
	// ����ֵ�ĵ��ַ��������Ƿ���ִ�����֮����ת����һ��ҳ��
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
		List<Requirement> requirements = requirementDao.getRequirement(new PageInfo());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		ServletActionContext.getRequest().setAttribute("requirements", requirements);
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pageInfo.isPage = true;
		List<Requirement> requirements = requirementDao.getRequirement(pageInfo);// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		ServletActionContext.getRequest().setAttribute("requirements", requirements);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Requirement requirementPO = requirementDao.getById(requirement.getrID());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
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