package hw3;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("阿文...請輸入你討厭哪個數字ヽ(｀Д´)ﾉ: ");
		int j = sc.nextInt();
		int[] lottoArray =  new int[48];

		int sum = 0;		
		for(int i = 1 ; i <= 49 ; i++) {
			if(i / 10 == j || i % 10 == j)	
				continue;			
			lottoArray[sum] = i;
			sum++;			
			}		
		
		for(int i = 0; i < lottoArray.length; i++) {
			if(lottoArray[i] == 0)
				break;
			System.out.print(lottoArray[i] + "\t");
			if((i + 1) % 6 == 0) 
				System.out.println();
		}
		System.out.println("總共有" + sum + "個數字可選");
		System.out.println("=============================================");		
		System.out.println("隨機抽取六個數: ");		
		int count;
		for(count = 0; count < 6; count++) {
			int x = (int)(Math.random() * (sum + 1)); // 產生0 ~ sum的亂數
			if(lottoArray[x] == 0) {
				count--;
				continue;
			}
			System.out.print(lottoArray[x] + "\t");
			lottoArray[x] = 0;			
		}				
	}

}
