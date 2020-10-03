package nuc.ss.entity;

public class Company {
	private String gs_no;
	private String gs_password;
	
	public Company(String gs_no, String gs_password) {
		super();
		this.gs_no = gs_no;
		this.gs_password = gs_password;
	}
	public String getGs_no() {
		return gs_no;
	}
	public void setGs_no(String gs_no) {
		this.gs_no = gs_no;
	}
	public String getGs_password() {
		return gs_password;
	}
	public void setGs_password(String gs_password) {
		this.gs_password = gs_password;
	}
	@Override
	public String toString() {
		return "company [gs_no=" + gs_no + ", gs_password=" + gs_password + "]";
	}
}
