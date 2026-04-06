package hw1;

public class CompoundInterest {
	public static void main(String[] args) {
		
		double presentValue = 1_500_000;
		double i = Math.pow(1.02, 10);
		double futureValue = presentValue * i;
		System.out.printf("10年後的本金加利息共有%.2f元", futureValue);
		
	}

}
