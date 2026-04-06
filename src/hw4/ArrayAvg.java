package hw4;

public class ArrayAvg {
	public static void main(String[] args) {
		
		int[] x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];			
		}
		System.out.print("大於平均值的數是:" + " ");
		int avg = sum / x.length;
		for(int i = 0; i < x.length; i++) {
			if(avg < x[i])
				System.out.print(x[i] + "\t" );
		}
		System.out.println();
		System.out.println("所有元素的平均值是: " + avg);
	}

}
