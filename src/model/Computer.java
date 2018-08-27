package model;

public class Computer {
	public Computer(int cID, String cBrand, String cModel) {
		super();
		this.cID = cID;
		this.cBrand = cBrand;
		this.cModel = cModel;
	}
	private int cID;
	private String cBrand;
	private String cModel;
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getcBrand() {
		return cBrand;
	}
	public void setcBrand(String cBrand) {
		this.cBrand = cBrand;
	}
	public String getcModel() {
		return cModel;
	}
	public void setcModel(String cModel) {
		this.cModel = cModel;
	}
}
