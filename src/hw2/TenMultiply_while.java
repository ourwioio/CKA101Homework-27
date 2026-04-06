package hw2;

public class TenMultiply_while {
	public static void main(String[] args) {
		int sum = 1, i = 1;
		while(i <= 10) {
			sum = sum * i;
			i++;
		}
		System.out.println(sum);
	}

}
