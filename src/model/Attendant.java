package model;

public class Attendant {
	private int aID;//维修人员ID
	private String aName;//维修人员姓名
	private String aTrueName;//维修人员真实姓名
	private String aPwd;//维修人员密码
	private int aTel;//维修人员电话
	private String aAdress;//维修人员地址
	private String aEmail;//维修人员邮箱
	private int aCredit;//维修人员信用
	private String imgsrc;
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	public int getaID() {
		return aID;
	}
	public void setaID(int aID) {
		this.aID = aID;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaTrueName() {
		return aTrueName;
	}
	public void setaTrueName(String aTrueName) {
		this.aTrueName = aTrueName;
	}
	public String getaPwd() {
		return aPwd;
	}
	public void setaPwd(String aPwd) {
		this.aPwd = aPwd;
	}
	public int getaTel() {
		return aTel;
	}
	public void setaTel(int aTel) {
		this.aTel = aTel;
	}
	public String getaAdress() {
		return aAdress;
	}
	public void setaAdress(String aAdress) {
		this.aAdress = aAdress;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public int getaCredit() {
		return aCredit;
	}
	public void setaCredit(int aCredit) {
		this.aCredit = aCredit;
	}
	public Attendant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendant(int aID, String aName, String aTrueName, String aPwd, int aTel, String aAdress, String aEmail,
			int aCredit) {
		super();
		this.aID = aID;
		this.aName = aName;
		this.aTrueName = aTrueName;
		this.aPwd = aPwd;
		this.aTel = aTel;
		this.aAdress = aAdress;
		this.aEmail = aEmail;
		this.aCredit = aCredit;
	}
}
