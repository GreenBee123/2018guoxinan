package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.LightningrecordDao;

import model.Lightningrecord;
import page.PageInfo;

public class LightningrecordAction extends ActionSupport {
	// struts action中方法的规范，1.只能是返回String 2 不能有参数，3 必须抛出异常
	// 返回值的的字符串，就是方法执行完毕之后，跳转的下一个页面
	LightningrecordDao lightningrecordDao;
	Lightningrecord lightningrecord;
	PageInfo pageInfo;

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public LightningrecordDao getLightningrecordDao() {
		return lightningrecordDao;
	}

	public void setLightningrecordDao(LightningrecordDao lightningrecordDao) {
		this.lightningrecordDao = lightningrecordDao;
	}

	public Lightningrecord getLightningrecord() {
		return lightningrecord;
	}

	public void setLightningrecord(Lightningrecord lightningrecord) {
		this.lightningrecord = lightningrecord;
	}

	public LightningrecordAction() {
		super();
		lightningrecordDao = new LightningrecordDao();
		pageInfo = new PageInfo();
	}

	public String getAll() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		List<Lightningrecord> lightningrecords = lightningrecordDao.getLightningrecord(new PageInfo());// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("lightningrecords", lightningrecords);
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pageInfo.isPage = true;
		List<Lightningrecord> lightningrecords = lightningrecordDao.getLightningrecord(pageInfo);// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("lightningrecords", lightningrecords);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Lightningrecord lightningrecordPO = lightningrecordDao.getById(lightningrecord.getlID());// 页面输出正确地址，这个方法就会被调用，
		ServletActionContext.getRequest().setAttribute("lightningrecord", lightningrecordPO);
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		lightningrecordDao.add(lightningrecord);
		System.out.println("add执行完毕");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		lightningrecordDao.update(lightningrecord);
		System.out.println("update执行完毕");
		return null;
	}

}