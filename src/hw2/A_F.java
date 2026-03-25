package hw2;

public class A_F {
	public static void main(String[] args) {
		char j = 65;
		for(int i = 1;i <= 6 ; i++) {
			int count = 1;
			while(count <= i) {
				System.out.print(j);
				count++;
			}
			j += 1;
			System.out.println();
		}
	}
}
