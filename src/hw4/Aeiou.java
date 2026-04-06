package hw4;

public class Aeiou {
	public static void main(String[] args) {
		String[] s1 = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String s2 = "aeiou";
		int sum = 0;
		for(int i = 0; i < s1.length; i++) {				//取得行星個別字串
			for(int j = 0; j < s1[i].length(); j++) {    	//取得行星個別字元
				for(int m = 0; m < s2.length(); m++) {   	//取得母音個別字元
					char a = s1[i].charAt(j);
					char b = s2.charAt(m);
					if(a == b) {							//字元比對
					sum++;
					}
				}
			}
		}
		System.out.println(sum); 		
	}

}
