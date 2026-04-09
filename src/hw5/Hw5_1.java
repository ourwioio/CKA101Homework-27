package hw5;

import java.util.Scanner;

public class Hw5_1 {
	
	public static void starSquare(int width, int height) {
		
		int[][] square = new int[height][width];		
		for(int i = 0; i < square.length;i ++) {
			for(int j = 0; j < square[i].length; j++) {
				System.out.print("*");				
				
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高 : ");
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);
		
	}
	

}
