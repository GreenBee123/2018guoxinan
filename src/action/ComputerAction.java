package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import dao.ComputerDao;
import model.Ad;
import model.Computer;
import page.PageInfo;

public class ComputerAction {
	// struts action�з����Ĺ淶��1.ֻ���Ƿ���String 2 �����в�����3 �����׳��쳣
	// ����ֵ�ĵ��ַ��������Ƿ���ִ�����֮����ת����һ��ҳ��
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
		List<Computer> computers = computerDao.getComputer(new PageInfo());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �������������ִ���˶�Ӧdao�ж�Ӧ�Ĳ�ѯ���ݿ�ķ���
		// �����ݿ���ȡ���ļ��ϴ�ŵ�ҳ��
		ServletActionContext.getRequest().setAttribute("computers", computers);
		System.out.println("getAllִ�����");
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pageInfo.isPage = true;
		List<Computer> computers = computerDao.getComputer(pageInfo);// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �������������ִ���˶�Ӧdao�ж�Ӧ�Ĳ�ѯ���ݿ�ķ���
		// �����ݿ���ȡ���ļ��ϴ�ŵ�ҳ��
		ServletActionContext.getRequest().setAttribute("computers", computers);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		System.out.println("getAllByPageִ�����");
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Computer computerPO = computerDao.getById(computer.getcID());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �������������ִ���˶�Ӧdao�ж�Ӧ�Ĳ�ѯ���ݿ�ķ���
		// �����ݿ���ȡ���ļ��ϴ�ŵ�ҳ��
		ServletActionContext.getRequest().setAttribute("computer", computerPO);
		System.out.println("getByIdִ�����");
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		computerDao.add(computer);
		System.out.println("addִ�����");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		computerDao.update(computer);
		System.out.println("updateִ�����");
		return null;
	}
}