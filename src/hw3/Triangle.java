package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] triangleSide = new int[3];
		for(int j = 0; j < triangleSide.length; j++) {
			System.out.print("請輸入第" + (j + 1) + "個邊長：");
			int i = sc.nextInt();			
			triangleSide[j] = i;			
		}

		Arrays.sort(triangleSide); //由小到大排序
		
		int a = triangleSide[0], b = triangleSide[1], c = triangleSide[2]; 
		
		if(a + b <= c) {
			System.out.println("不是三角形");
		}else {
			if(a == b && b == c) {
				System.out.println("正三角形");				
			}else if(a == b || b == c) {
				System.out.println("等腰三角形");
			}else if(c * c == a * a + b * b) {
				System.out.println("直角三角形");
			}else {
				System.out.println("其他三角形");
			}
		}
	}
}		
				
	
			

