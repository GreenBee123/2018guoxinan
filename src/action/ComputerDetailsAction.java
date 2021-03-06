package action;

import java.util.List;

import javax.servlet.RequestDispatcher;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.ComputerDetailsDao;
import model.ComputerDetails;
import page.PageInfo;

public class ComputerDetailsAction extends ActionSupport {
	// struts action中方法的规范，1.只能是返回String 2 不能有参数，3 必须抛出异常
	// 返回值的的字符串，就是方法执行完毕之后，跳转的下一个页面
	ComputerDetailsDao computerDetailsDao;
	ComputerDetails computerDetails;
	PageInfo pageInfo;

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public ComputerDetailsDao getComputerDetailsDao() {
		return computerDetailsDao;
	}

	public void setComputerDetailsDao(ComputerDetailsDao computerDetailsDao) {
		this.computerDetailsDao = computerDetailsDao;
	}

	public ComputerDetails getComputerDetails() {
		return computerDetails;
	}

	public void setComputerDetails(ComputerDetails computerDetails) {
		this.computerDetails = computerDetails;
	}

	public ComputerDetailsAction() {
		super();
		computerDetailsDao = new ComputerDetailsDao();
		pageInfo = new PageInfo();
	}

	public String getAll() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		List<ComputerDetails> computerDetails = computerDetailsDao.getComputerDetails(new PageInfo());// 页面输出正确地址，这个方法就会被调用，
		// 调用这个方法就执行了对应dao中对应的查询数据库的方法
		// 就一直能够找到自己存放的内容，如果经过了response的切换，再次请求已经是不同的request
		ServletActionContext.getRequest().setAttribute("computerDetails", computerDetails);
		System.out.println("getAll执行完毕");
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pageInfo.isPage = true;
		List<ComputerDetails> computerDetails = computerDetailsDao.getComputerDetails(pageInfo);// );//页面输出正确地址，这个方法就会被调用，
		// 调用这个方法就执行了对应dao中对应的查询数据库的方法
		ServletActionContext.getRequest().setAttribute("computerDetails", computerDetails);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		System.out.println("getAllByPage执行完毕");
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		ComputerDetails computerDetailsPO = computerDetailsDao.getById(computerDetails.getdID());// 页面输出正确地址，这个方法就会被调用，
		// 将数据库中取出的集合存放到页面
		ServletActionContext.getRequest().setAttribute("computerDetails", computerDetailsPO);
		System.out.println("getById执行完毕");
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		computerDetailsDao.add(computerDetails);
		System.out.println("add执行完毕");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		computerDetailsDao.update(computerDetails);
		System.out.println("update执行完毕");
		return null;
	}

}