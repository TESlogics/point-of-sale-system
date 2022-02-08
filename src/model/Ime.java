package model;

public class Ime {

	private String mobileBrand;
	private String Ime;
	private String color;
	private String rom;
	private String ram;
	private String phone;
	private String barcode;
	private String category;
	private String supplier;
	private String dateAdded;
	private int stock;
	private double price;

	public Ime() {
	}

	public Ime(String mobileBrand, String ime, String color, String rom, String ram, String phone, String barcode, String category, String supplier, String dateAdded, int stock, double price) {
		this.mobileBrand = mobileBrand;
		Ime = ime;
		this.color = color;
		this.rom = rom;
		this.ram = ram;
		this.phone = phone;
		this.barcode = barcode;
		this.category = category;
		this.supplier = supplier;
		this.dateAdded = dateAdded;
		this.stock = stock;
		this.price = price;
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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
