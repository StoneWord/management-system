package nuc.ss.entity;

public class Courier {
	private int ps_no;
	private String ps_name;
	private String ps_phone;
	private String ps_area;
	private int ps_num;
	private int ps_salary;
	private String ps_password;
	private String gs_no;
	
	public Courier(int ps_no, String ps_name, String ps_phone, String ps_area, int ps_num, int ps_salary,
			String ps_password, String gs_no) {
		super();
		this.ps_no = ps_no;
		this.ps_name = ps_name;
		this.ps_phone = ps_phone;
		this.ps_area = ps_area;
		this.ps_num = ps_num;
		this.ps_salary = ps_salary;
		this.ps_password = ps_password;
		this.gs_no = gs_no;
	}

	public int getPs_no() {
		return ps_no;
	}

	public void setPs_no(int ps_no) {
		this.ps_no = ps_no;
	}

	public String getPs_name() {
		return ps_name;
	}

	public void setPs_name(String ps_name) {
		this.ps_name = ps_name;
	}

	public String getPs_phone() {
		return ps_phone;
	}

	public void setPs_phone(String ps_phone) {
		this.ps_phone = ps_phone;
	}

	public String getPs_area() {
		return ps_area;
	}

	public void setPs_area(String ps_area) {
		this.ps_area = ps_area;
	}

	public int getPs_num() {
		return ps_num;
	}

	public void setPs_num(int ps_num) {
		this.ps_num = ps_num;
	}

	public int getPs_salary() {
		return ps_salary;
	}

	public void setPs_salary(int ps_salary) {
		this.ps_salary = ps_salary;
	}

	public String getPs_password() {
		return ps_password;
	}

	public void setPs_password(String ps_password) {
		this.ps_password = ps_password;
	}

	public String getGs_no() {
		return gs_no;
	}

	public void setGs_no(String gs_no) {
		this.gs_no = gs_no;
	}

	@Override
	public String toString() {
		return "courier [ps_no=" + ps_no + ", ps_name=" + ps_name + ", ps_phone=" + ps_phone + ", ps_area=" + ps_area
				+ ", ps_num=" + ps_num + ", ps_salary=" + ps_salary + ", ps_password=" + ps_password + ", gs_no="
				+ gs_no + "]";
	}	
}
