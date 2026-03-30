package hw3;

import java.util.Scanner;

public class NumberGame9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random() * 10); // 0 ~ 9
		System.out.println("開始猜數字吧!");
//		System.out.println(x); 
		while(true) {
			int i = sc.nextInt();	
			if(i == x) {
				break;
			}else {
				System.out.println("猜錯囉");
			}
		}
		System.out.println("答對了！答案就是 " + x);
						
		
	}

}
