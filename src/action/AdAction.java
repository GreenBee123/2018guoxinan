package action;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import dao.AdDao;
import model.Ad;
import page.PageInfo;

public class AdAction {
	// struts action中方法的规范，1.只能是返回String 2 不能有参数，3 必须抛出异常
	// 返回值的的字符串，就是方法执行完毕之后，跳转的下一个页面
	AdDao adDao;
	Ad ad;
	PageInfo pageInfo;

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public AdDao getAdDao() {
		return adDao;
	}

	public void setAdDao(AdDao adDao) {
		this.adDao = adDao;
	}

	public Ad getAd() {
		return ad;
	}

	public void setAd(Ad ad) {
		this.ad = ad;
	}

	public AdAction() {
		super();
		// TODO Auto-generated constructor stub
		adDao = new AdDao();
		pageInfo = new PageInfo();
	}

	public String getAll() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		List<Ad> ads = adDao.getAd(new PageInfo());// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("ads", ads);
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		// 如果用户没有输入当前页第一条的编号，默认为第一页
		pageInfo.isPage = true;
		List<Ad> ads = adDao.getAd(pageInfo);// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("ads", ads);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Ad adPO = adDao.getById(ad.getAdID());// 页面输出正确地址，这个方法就会被调用，
		// 将数据库中取出的集合存放到页面
		ServletActionContext.getRequest().setAttribute("ad", adPO);
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		adDao.add(ad);
		System.out.println("add执行完毕");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		adDao.update(ad);
		System.out.println("add执行完毕");
		return null;
	}
}
