package model;

import java.sql.Timestamp;

public class Lightningrecord {
	public Lightningrecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int lID;                    //	ID	
	private Timestamp lTime;            //	����ʱ��
	private Timestamp lCheakTime;       //	�ջ�ʱ��
	private Timestamp lCheakTakeTime;   //	ȷ���ջ�ʱ��
	private String lCheakRemarks;       //	�ջ�����
	private String lUserCharge;         //	�û�����
	private String lAttendantCharge;    //	ά����Ա����
	public Lightningrecord(int lID, Timestamp lTime, Timestamp lCheakTime, Timestamp lCheakTakeTime,
			String lCheakRemarks, String lUserCharge, String lAttendantCharge) {
		super();
		this.lID = lID;
		this.lTime = lTime;
		this.lCheakTime = lCheakTime;
		this.lCheakTakeTime = lCheakTakeTime;
		this.lCheakRemarks = lCheakRemarks;
		this.lUserCharge = lUserCharge;
		this.lAttendantCharge = lAttendantCharge;
	}
	public int getlID() {
		return lID;
	}
	public void setlID(int lID) {
		this.lID = lID;
	}
	public Timestamp getlTime() {
		return lTime;
	}
	public void setlTime(Timestamp lTime) {
		this.lTime = lTime;
	}
	public Timestamp getlCheakTime() {
		return lCheakTime;
	}
	public void setlCheakTime(Timestamp lCheakTime) {
		this.lCheakTime = lCheakTime;
	}
	public Timestamp getlCheakTakeTime() {
		return lCheakTakeTime;
	}
	public void setlCheakTakeTime(Timestamp lCheakTakeTime) {
		this.lCheakTakeTime = lCheakTakeTime;
	}
	public String getlCheakRemarks() {
		return lCheakRemarks;
	}
	public void setlCheakRemarks(String lCheakRemarks) {
		this.lCheakRemarks = lCheakRemarks;
	}
	public String getlUserCharge() {
		return lUserCharge;
	}
	public void setlUserCharge(String lUserCharge) {
		this.lUserCharge = lUserCharge;
	}
	public String getlAttendantCharge() {
		return lAttendantCharge;
	}
	public void setlAttendantCharge(String lAttendantCharge) {
		this.lAttendantCharge = lAttendantCharge;
	}

	
}