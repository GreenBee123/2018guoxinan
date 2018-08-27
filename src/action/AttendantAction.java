package action;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import dao.AttendantDao;
import model.Attendant;
import page.PageInfo;

public class AttendantAction {
	// struts action�з����Ĺ淶��1.ֻ���Ƿ���String 2 �����в�����3 �����׳��쳣
	// ����ֵ�ĵ��ַ��������Ƿ���ִ�����֮����ת����һ��ҳ��
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
		List<Attendant> attendants = attendantDao.getAttendant(new PageInfo());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �������������ִ���˶�Ӧdao�ж�Ӧ�Ĳ�ѯ���ݿ�ķ���
		// �����ݿ���ȡ���ļ��ϴ�ŵ�ҳ��
		ServletActionContext.getRequest().setAttribute("attendants", attendants);
		System.out.println("getAllִ�����");
		return null;
	}

	public String getAllByPage() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		// ����û�û�����뵱ǰҳ��һ���ı�ţ�Ĭ��Ϊ��һҳ
		pageInfo.isPage = true;
		List<Attendant> attendants = attendantDao.getAttendant(pageInfo);// );// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �������������ִ���˶�Ӧdao�ж�Ӧ�Ĳ�ѯ���ݿ�ķ���
		// �����ݿ���ȡ���ļ��ϴ�ŵ�ҳ��
		ServletActionContext.getRequest().setAttribute("attendants", attendants);
		ServletActionContext.getRequest().setAttribute("pageInfo", pageInfo);
		System.out.println("getAllByPageִ�����");
		return null;
	}

	public String getById() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		Attendant attendantPO = attendantDao.getById(attendant.getaID());// ҳ�������ȷ��ַ����������ͻᱻ���ã�
		// �������������ִ���˶�Ӧdao�ж�Ӧ�Ĳ�ѯ���ݿ�ķ���
		// �����ݿ���ȡ���ļ��ϴ�ŵ�ҳ��
		ServletActionContext.getRequest().setAttribute("attendant", attendantPO);
		System.out.println("getByIdִ�����");
		return null;
	}

	public String add() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		attendantDao.add(attendant);
		System.out.println("addִ�����");
		return null;
	}

	public String update() throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		attendantDao.update(attendant);
		System.out.println("updateִ�����");
		return null;
	}
}