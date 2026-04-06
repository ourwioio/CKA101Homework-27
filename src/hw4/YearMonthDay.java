package hw4;

import java.util.Scanner;

public class YearMonthDay {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};			
		int y, m, d;
		
		while(true) {
			System.out.print("請輸入年月日: ");
			y = sc.nextInt();
			m = sc.nextInt();
			d = sc.nextInt();
			if(m >12 || m < 1) {
				System.out.print("輸入錯誤" + "沒有" + m + "月 請重新輸入!" + "\n");	
				continue;
			}
			if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
				month[2]++;
				if (d > month[m]) {
					System.out.print("輸入錯誤" + "該月日期不該超過" + month[m] + " 請重新輸入!" + "\n");	
					month[2]--;
					continue;
				}else
					break;
			}else if(d > month[m]) {
				System.out.print("輸入錯誤" + "該月日期不該超過" + month[m] + " 請重新輸入!" + "\n");		
				continue;
			}else 
				break;
			}
				
		int sum = 0;
		for(int i = 1; i < m; i++) {
			sum = month[i] + sum;				
		}
		sum += d;		
		System.out.println(y +" "+ m + " " + d);
		System.out.println("輸入的日期為該年第" + sum + "天");	
	}
}
