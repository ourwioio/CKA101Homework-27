package hw5;

public class Hw5_2 {
	
	public static void randAvg() {
		int[] rand = new int[10];
		System.out.println("本次亂數結果 : ");
		int sum = 0;
		for(int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random()*101);
			System.out.print(rand[i] + " ");
			sum += rand[i];
		}
		System.out.println();
		System.out.println("平均值為 : " + sum / rand.length);
	}
	
	public static void main(String[] args) {
		randAvg();
	}
	
}
