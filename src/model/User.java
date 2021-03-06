package model;

import java.math.BigDecimal;

public class User {
	private int uID;
	private String uName;
	private String uTrueName;
	private String uPwd;
	private BigDecimal uTel;
	private String uAdress;
	private String uEmail;
	private int uCredit;
	private int imgsrc;
	public int getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(int imgsrc) {
		this.imgsrc = imgsrc;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uID, String uName, String uTrueName, String uPwd, BigDecimal uTel, String uAdress, String uEmail,
			int uCredit) {
		super();
		this.uID = uID;
		this.uName = uName;
		this.uTrueName = uTrueName;
		this.uPwd = uPwd;
		this.uTel = uTel;
		this.uAdress = uAdress;
		this.uEmail = uEmail;
		this.uCredit = uCredit;
	}
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuTrueName() {
		return uTrueName;
	}
	public void setuTrueName(String uTrueName) {
		this.uTrueName = uTrueName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public BigDecimal getuTel() {
		return uTel;
	}
	public void setuTel(BigDecimal uTel) {
		this.uTel = uTel;
	}
	public String getuAdress() {
		return uAdress;
	}
	public void setuAdress(String uAdress) {
		this.uAdress = uAdress;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public int getuCredit() {
		return uCredit;
	}
	public void setuCredit(int uCredit) {
		this.uCredit = uCredit;
	}
}
