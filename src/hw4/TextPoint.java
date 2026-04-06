package hw4;

public class TextPoint {
	public static void main(String[] args) {
		
		int[][] test = {{ 0, 0, 0, 0, 0, 0, 0, 0, 0},
				        { 1, 10 , 35, 40, 100, 90, 85, 75, 70},
				        { 2, 37, 75, 77, 89, 64, 75, 70, 95},
				        { 3, 100, 70, 79, 90, 75, 70, 79, 90},
				        { 4, 77, 95, 70, 89, 60, 75, 85, 89},
				        { 5, 98, 70, 89, 90, 75, 90, 89, 90},
				        { 6, 90, 80, 100, 75, 50, 20, 99, 75}};

		for(int i = 1; i < test.length; i++) {		
			int max = test[i][1];           //假設第一個分數為最高分
			for(int j = 1; j < test[i].length; j++) {
				if(test[i][j] > max) {		//一個一個比較找出最高分
					max = test[i][j];   
				}
			}
			for(int j = 1; j < test[i].length; j++) {   //找出最大值後，找出跟最高分數一樣的人
				if(max == test[i][j]) {
					test[0][j]++;					
				}
			}
		}
		for(int i = 1; i < test[0].length; i++) {
			System.out.println(i + "號同學" + "考最高分的次數是" + test[0][i] + "次");
		}		
	}
}
