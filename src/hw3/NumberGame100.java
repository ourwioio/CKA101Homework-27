package hw3;

import java.util.Scanner;

public class NumberGame100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random() * 100); // 0 ~ 100
		System.out.println("0 ~ 100 開始猜數字吧!");
//		System.out.println(x);
		while(true) {
			int i = sc.nextInt();	
			if(i == x) {
				break;
			}else if(i < x) {
				System.out.println("小於答案！");
			}else if(i > x) {
				System.out.println("大於答案！");
			}
		}
		System.out.println("おめでとう！答案就是 " + x);
		
	}

}
