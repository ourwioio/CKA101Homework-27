package hw2;

public class TenMultiply_for{
	public static void main(String[] args) {
		int sum = 1;
		for(int i = 1; i <= 10; i++) {
			sum = i * sum;
		}
		System.out.println(sum);
	}

}
