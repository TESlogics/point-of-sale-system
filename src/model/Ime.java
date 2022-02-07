package model;

public class Ime {

	private String mobileBrand;
	private String Ime;
	private String color;
	private String rom;
	private String ram;
	private String phone;

	public Ime() {

	}


	public Ime(String mobileBrand, String ime, String color, String rom, String ram, String phone) {
		super();
		this.mobileBrand = mobileBrand;
		Ime = ime;
		this.color = color;
		this.rom = rom;
		this.ram = ram;
		this.phone = phone;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
