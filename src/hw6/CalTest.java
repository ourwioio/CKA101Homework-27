package hw6;

import java.util.*;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator ca = new Calculator();

		while (true) {
			try {
				System.out.println("請輸入x的值：");
				int x = sc.nextInt();
				System.out.println("請輸入y的值：");
				int y = sc.nextInt();
				int result = ca.powerXY(x, y);
				System.out.println(x + "的" + "次方等於" + result);
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException i) {
				System.out.println("輸入格式不正確");
				sc.next(); // 把輸入的字串給清除，繼續下一個迴圈
			}
		}
		sc.close();
	}
}
