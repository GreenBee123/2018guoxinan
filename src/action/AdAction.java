package action;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import dao.AdDao;
import model.Ad;
import page.PageInfo;

public class AdAction {
	// struts action�з����Ĺ淶��1.ֻ���Ƿ���String 2 �����в�����3 �����׳��쳣
	// ����ֵ�ĵ��ַ��������Ƿ���ִ�����֮����ת����һ��ҳ��
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
		List<Ad> ads = adDao.getAd(new PageInfo());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		ServletActionContext.getRequest().setAttribute("ads", ads);
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		// ����û�û�����뵱ǰҳ��һ���ı�ţ�Ĭ��Ϊ��һҳ
		pageInfo.isPage = true;
		List<Ad> ads = adDao.getAd(pageInfo);// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		ServletActionContext.getRequest().setAttribute("ads", ads);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Ad adPO = adDao.getById(ad.getAdID());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �����ݿ���ȡ���ļ��ϴ�ŵ�ҳ��
		ServletActionContext.getRequest().setAttribute("ad", adPO);
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		adDao.add(ad);
		System.out.println("addִ�����");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		adDao.update(ad);
		System.out.println("addִ�����");
		return null;
	}
}