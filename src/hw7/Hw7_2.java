package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Hw7_2 {
	public static void main(String[] args) throws IOException {
		
		
		Set<Integer> randomSafe = new HashSet<Integer>();
		while(randomSafe.size() != 10) {
			int ran = (int)(Math.random() * 1000) + 1;
			randomSafe.add(ran);
		}
		
		FileOutputStream fos = new FileOutputStream("src/hw7/Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		
		ps.println(randomSafe);
		
		
	
		ps.close();
		bos.close();
		fos.close();
		
		
	}
}
