package model;

public class Ad {
	public int getAdID() {
		return adID;
	}
	public void setAdID(int adID) {
		this.adID = adID;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdPwd() {
		return adPwd;
	}
	public void setAdPwd(String adPwd) {
		this.adPwd = adPwd;
	}
	public Ad(int adID, String adName, String adPwd) {
		super();
		this.adID = adID;
		this.adName = adName;
		this.adPwd = adPwd;
	}
	public Ad() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int adID;//����ԱID
	private String adName;//����Ա��
	private String adPwd;//����Ա����
	private String imgsrc;
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	
}
