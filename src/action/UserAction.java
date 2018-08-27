package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import dao.UserDao;
import model.Ad;
import model.User;
import page.PageInfo;

public class UserAction {
	// struts action中方法的规范，1.只能是返回String 2 不能有参数，3 必须抛出异常
	// 返回值的的字符串，就是方法执行完毕之后，跳转的下一个页面
	UserDao userDao;
	User user;
	PageInfo pageInfo;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserAction() {
		super();
		// TODO Auto-generated constructor stub
		userDao = new UserDao();
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
		List<User> users = userDao.getUser(new PageInfo());// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("users", users);
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pageInfo.isPage = true;
		List<User> users = userDao.getUser(pageInfo);// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("users", users);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		User userPO = userDao.getById(user.getuID());// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("user", userPO);
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		userDao.add(user);
		System.out.println("add执行完毕");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		userDao.update(user);
		System.out.println("add执行完毕");
		return null;
	}
}
