package nuc.ss.entity;

public class Information {
	private int	kd_no;
	private String	sj_name;
	private String	sj_phone;
	private String	sj_address;
	private String	fj_name;
	private String	fj_phone;
	private String	fj_address;
	private String	ps_name;
	private String	ps_phone;
	private String	ps_condition;
	private String	gs_no;
	private String  ps_no;
	public Information(int kd_no, String sj_name, String sj_phone, String sj_address, String fj_name,
			String fj_phone, String fj_address, String ps_name, String ps_phone, String ps_condition, String gs_no,String ps_no) {
		super();
		this.kd_no = kd_no;
		this.sj_name = sj_name;
		this.sj_phone = sj_phone;
		this.sj_address = sj_address;
		this.fj_name = fj_name;
		this.fj_phone = fj_phone;
		this.fj_address = fj_address;
		this.ps_name = ps_name;
		this.ps_phone = ps_phone;
		this.ps_condition = ps_condition;
		this.gs_no = gs_no;
		this.ps_no = ps_no;
	}
	public int getKd_no() {
		return kd_no;
	}
	public void setKd_no(int kd_no) {
		this.kd_no = kd_no;
	}
	public String getPs_name() {
		return ps_name;
	}
	public void setPs_name(String ps_name) {
		this.ps_name = ps_name;
	}
	public String getSj_name() {
		return sj_name;
	}
	public void setSj_name(String sj_name) {
		this.sj_name = sj_name;
	}
	public String getSj_phone() {
		return sj_phone;
	}
	public void setSj_phone(String sj_phone) {
		this.sj_phone = sj_phone;
	}
	public String getSj_address() {
		return sj_address;
	}
	public void setSj_address(String sj_address) {
		this.sj_address = sj_address;
	}
	public String getFj_name() {
		return fj_name;
	}
	public void setFj_name(String fj_name) {
		this.fj_name = fj_name;
	}
	public String getFj_phone() {
		return fj_phone;
	}
	public void setFj_phone(String fj_phone) {
		this.fj_phone = fj_phone;
	}
	public String getFj_address() {
		return fj_address;
	}
	public void setFj_address(String fj_address) {
		this.fj_address = fj_address;
	}
	public String getPs_no() {
		return ps_no;
	}
	public void setPs_no(String ps_no) {
		this.ps_no = ps_no;
	}
	public String getPs_phone() {
		return ps_phone;
	}
	public void setPs_phone(String ps_phone) {
		this.ps_phone = ps_phone;
	}
	public String getPs_condition() {
		return ps_condition;
	}
	public void setPs_condition(String ps_condition) {
		this.ps_condition = ps_condition;
	}
	public String getGs_no() {
		return gs_no;
	}
	public void setGs_no(String gs_no) {
		this.gs_no = gs_no;
	}
	@Override
	public String toString() {
		return "information [kd_no=" + kd_no + ", sj_name=" + sj_name + ", sj_phone=" + sj_phone + ", sj_address="
				+ sj_address + ", fj_name=" + fj_name + ", fj_phone=" + fj_phone + ", fj_address=" + fj_address
				+ ", ps_no=" + ps_no + ", ps_phone=" + ps_phone + ", ps_condition=" + ps_condition + ", gs_no=" + gs_no
				+ "]";
	}
		
}
