package action;

import java.util.List;

import javax.servlet.RequestDispatcher;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.ComputerDetailsDao;
import model.ComputerDetails;
import page.PageInfo;

public class ComputerDetailsAction extends ActionSupport {
	// struts action�з����Ĺ淶��1.ֻ���Ƿ���String 2 �����в�����3 �����׳��쳣
	// ����ֵ�ĵ��ַ��������Ƿ���ִ�����֮����ת����һ��ҳ��
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
		List<ComputerDetails> computerDetails = computerDetailsDao.getComputerDetails(new PageInfo());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �������������ִ���˶�Ӧdao�ж�Ӧ�Ĳ�ѯ���ݿ�ķ���
		// ��һֱ�ܹ��ҵ��Լ���ŵ����ݣ����������response���л����ٴ������Ѿ��ǲ�ͬ��request
		ServletActionContext.getRequest().setAttribute("computerDetails", computerDetails);
		System.out.println("getAllִ�����");
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pageInfo.isPage = true;
		List<ComputerDetails> computerDetails = computerDetailsDao.getComputerDetails(pageInfo);// );//ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �������������ִ���˶�Ӧdao�ж�Ӧ�Ĳ�ѯ���ݿ�ķ���
		ServletActionContext.getRequest().setAttribute("computerDetails", computerDetails);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		System.out.println("getAllByPageִ�����");
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		ComputerDetails computerDetailsPO = computerDetailsDao.getById(computerDetails.getdID());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �����ݿ���ȡ���ļ��ϴ�ŵ�ҳ��
		ServletActionContext.getRequest().setAttribute("computerDetails", computerDetailsPO);
		System.out.println("getByIdִ�����");
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		computerDetailsDao.add(computerDetails);
		System.out.println("addִ�����");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		computerDetailsDao.update(computerDetails);
		System.out.println("updateִ�����");
		return null;
	}

}