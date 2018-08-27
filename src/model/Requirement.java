package model;

import java.sql.Timestamp;

public class Requirement {
	private int rID;                //ID
	private Timestamp rTime;          //下单时间
	private String rRemarks;          //期望、备注
	private String rType;           //电脑损坏类型
	public Requirement(int rID, Timestamp rTime, String rRemarks, String rType) {
		super();
		this.rID = rID;
		this.rTime = rTime;
		this.rRemarks = rRemarks;
		this.rType = rType;
	}
	public int getrID() {
		return rID;
	}
	public void setrID(int rID) {
		this.rID = rID;
	}
	public Timestamp getrTime() {
		return rTime;
	}
	public void setrTime(Timestamp rTime) {
		this.rTime = rTime;
	}
	public String getrRemarks() {
		return rRemarks;
	}
	public void setrRemarks(String rRemarks) {
		this.rRemarks = rRemarks;
	}
	public String getrType() {
		return rType;
	}
	public Requirement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setrType(String rType) {
		this.rType = rType;
	}
}
