package action;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import dao.AttendantDao;
import model.Attendant;
import page.PageInfo;

public class AttendantAction {
	// struts action中方法的规范，1.只能是返回String 2 不能有参数，3 必须抛出异常
	// 返回值的的字符串，就是方法执行完毕之后，跳转的下一个页面
	AttendantDao attendantDao;
	Attendant attendant;
	PageInfo pageInfo;

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public AttendantDao getAttendantDao() {
		return attendantDao;
	}

	public void setAttendantDao(AttendantDao attendantDao) {
		this.attendantDao = attendantDao;
	}

	public Attendant getAttendant() {
		return attendant;
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public AttendantAction() {
		super();
		// TODO Auto-generated constructor stub
		attendantDao = new AttendantDao();
		pageInfo = new PageInfo();
	}

	public String getAll() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		List<Attendant> attendants = attendantDao.getAttendant(new PageInfo());// 页面输出正确地址，这个方法就会被调用，
		// 调用这个方法就执行了对应dao中对应的查询数据库的方法
		// 将数据库中取出的集合存放到页面
		ServletActionContext.getRequest().setAttribute("attendants", attendants);
		System.out.println("getAll执行完毕");
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		// 如果用户没有输入当前页第一条的编号，默认为第一页
		pageInfo.isPage = true;
		List<Attendant> attendants = attendantDao.getAttendant(pageInfo);// );// 页面输出正确地址，这个方法就会被调用，
		// 调用这个方法就执行了对应dao中对应的查询数据库的方法
		// 将数据库中取出的集合存放到页面
		ServletActionContext.getRequest().setAttribute("attendants", attendants);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		System.out.println("getAllByPage执行完毕");
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Attendant attendantPO = attendantDao.getById(attendant.getaID());// 页面输出正确地址，这个方法就会被调用，
		// 调用这个方法就执行了对应dao中对应的查询数据库的方法
		// 将数据库中取出的集合存放到页面
		ServletActionContext.getRequest().setAttribute("attendant", attendantPO);
		System.out.println("getById执行完毕");
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		attendantDao.add(attendant);
		System.out.println("add执行完毕");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		attendantDao.update(attendant);
		System.out.println("update执行完毕");
		return null;
	}
}
