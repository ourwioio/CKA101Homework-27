package hw5;

abstract class Pen {
	
	private String brand;
	private double price;

	public Pen() {
		}
	
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void getBrand() {
		System.out.println(brand);
	}
	
	public void getPrice() {
		System.out.println("價格是 : " + price);
	}
	
	public abstract void write();	

}
