package hw2;

public class Lotto {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 49 ; i++) {
			int ten = i /10;
			int unit = i % 10;
			if(ten == 4 || unit == 4) {				
				continue;				
			}
			sum += 1;
			System.out.print(i + " ");
		}
			System.out.println();
			System.out.println("總共有" + sum + "個");
	}

}
