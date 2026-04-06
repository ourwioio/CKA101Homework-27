package hw4;

import java.util.Scanner;

public class BorrowMoney {
	public static void main(String[] args) {
		
		int[][] eNumber = {{ 25, 32, 8, 19, 27},
					 	   { 2500, 800, 500, 1000, 1200}};
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入欲借金額: ");
		int money = sc.nextInt();
		System.out.print("有錢可借的員工編號: ");
		
		int sum = 0;
		for(int j = 0; j < eNumber[1].length; j++) {
			if(eNumber[1][j] >= money) {
			sum++;
			System.out.print(eNumber[0][j] + " ");
			}		
		}
		System.out.print("共" + sum + "人!");	
	}

}
