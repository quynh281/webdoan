package model;

public class lecturer {
	private int id;
	private String ten;
	private String chucDanh;
	private String email;
	private String boMon;
	private String urlImage;
	
	public lecturer() {
		super();
	}

	public lecturer(int id, String ten, String chucDanh, String email, String boMon, String urlImage) {
		super();
		this.id = id;
		this.ten = ten;
		this.chucDanh = chucDanh;
		this.email = email;
		this.urlImage = urlImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getChucDanh() {
		return chucDanh;
	}

	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBoMon() {
		return boMon;
	}

	public void setBoMon(String boMon) {
		this.boMon = boMon;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
}
