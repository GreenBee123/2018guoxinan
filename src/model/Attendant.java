package model;

public class Attendant {
	private int aID;//ά����ԱID
	private String aName;//ά����Ա����
	private String aTrueName;//ά����Ա��ʵ����
	private String aPwd;//ά����Ա����
	private int aTel;//ά����Ա�绰
	private String aAdress;//ά����Ա��ַ
	private String aEmail;//ά����Ա����
	private int aCredit;//ά����Ա����
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