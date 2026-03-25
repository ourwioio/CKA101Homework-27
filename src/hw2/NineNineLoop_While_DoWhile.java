package hw2;

public class NineNineLoop_While_DoWhile {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;								
			}while(j <= 9);
			i++;
			System.out.println();
		}
		
	}

}
