package hw5;

public class Pencil extends Pen {
	
	public Pencil(String brand, double price) {
		super(brand, price * 0.8);		
	}
	
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}

}
