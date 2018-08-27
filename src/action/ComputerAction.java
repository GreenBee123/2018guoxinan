package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import dao.ComputerDao;
import model.Ad;
import model.Computer;
import page.PageInfo;

public class ComputerAction {
	// struts action中方法的规范，1.只能是返回String 2 不能有参数，3 必须抛出异常
	// 返回值的的字符串，就是方法执行完毕之后，跳转的下一个页面
	ComputerDao computerDao;
	PageInfo pageInfo;

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public ComputerDao getComputerDao() {
		return computerDao;
	}

	public void setComputerDao(ComputerDao computerDao) {
		this.computerDao = computerDao;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	Computer computer;

	public ComputerAction() {
		super();
		// TODO Auto-generated constructor stub
		computerDao = new ComputerDao();
		pageInfo = new PageInfo();
	}

	public String getAll() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		List<Computer> computers = computerDao.getComputer(new PageInfo());// 页面输出正确地址，这个方法就会被调用，
		// 调用这个方法就执行了对应dao中对应的查询数据库的方法
		// 将数据库中取出的集合存放到页面
		ServletActionContext.getRequest().setAttribute("computers", computers);
		System.out.println("getAll执行完毕");
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pageInfo.isPage = true;
		List<Computer> computers = computerDao.getComputer(pageInfo);// 页面输出正确地址，这个方法就会被调用，
		// 调用这个方法就执行了对应dao中对应的查询数据库的方法
		// 将数据库中取出的集合存放到页面
		ServletActionContext.getRequest().setAttribute("computers", computers);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		System.out.println("getAllByPage执行完毕");
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Computer computerPO = computerDao.getById(computer.getcID());// 页面输出正确地址，这个方法就会被调用，
		// 调用这个方法就执行了对应dao中对应的查询数据库的方法
		// 将数据库中取出的集合存放到页面
		ServletActionContext.getRequest().setAttribute("computer", computerPO);
		System.out.println("getById执行完毕");
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		computerDao.add(computer);
		System.out.println("add执行完毕");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		computerDao.update(computer);
		System.out.println("update执行完毕");
		return null;
	}
}
