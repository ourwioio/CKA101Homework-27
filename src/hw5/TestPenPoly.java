package hw5;

public class TestPenPoly {
	public static void main(String[] args) {
		
		Pen[] p1 = new Pen[2];
		p1[0] = new Pencil("好寫鉛筆", 50);
		p1[1] = new InkBrush("好寫毛筆", 500);
		
		for(Pen p : p1) {
			p.getBrand();
			p.write();
			p.getPrice();
		}		
	}
}
