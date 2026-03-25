package hw2;

public class One_Ten {
	public static void main(String[] args) {
		
		for(int i = 10; i >= 1; i = i - 1) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();			
		}
		
	}

}
