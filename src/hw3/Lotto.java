package hw3;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("阿文...請輸入你討厭哪個數字ヽ(｀Д´)ﾉ: ");
		int j = sc.nextInt();
		int[] lottoArray =  new int[49];

		int sum = 0;
		if(j > 0 && j < 10) {
			for(int i = 1 ; i <= 49 ; i++) {
				if(i /10 == j || i % 10 == j)	
					continue;			
				lottoArray[sum] = i;
				sum++;			
				}
		}else if(j == 0 ) {
			for(int i = 1 ; i <= 49 ; i++) {
				if(i % 10 == 0)			
					continue;			
				lottoArray[sum] = i;
				sum++;			
				}			
		}else if (j > 10){
			for(int i = 1 ; i <= 49 ; i++) {
				if(i == j)			
					continue;			
				lottoArray[sum] = i;
				sum++;	
			}			
		}	
			int y = 1;
		for(int m = 0; m < lottoArray.length; m++) {
			if(lottoArray[m] == 0)
				break;
			System.out.print(lottoArray[m] + "\t");
			if(y % 6 == 0) 
				System.out.println();
			y++;
		}
		System.out.println("總共有" + sum + "個數字可選");
		System.out.println("=============================================");
		
		System.out.println("隨機抽取六個數: ");		
		int count;
		for(count = 0; count < 6; count++) {
			int x = (int)(Math.random() * sum); // 0 ~ sum
			if(lottoArray[x] == 0) {
				count--;
				continue;
			}
			System.out.print(lottoArray[x] + "\t");
			lottoArray[x] = 0;			
		}				
	}

}
