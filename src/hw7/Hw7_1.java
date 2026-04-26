package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
	public static void main(String[] args) throws IOException {
		
		int i;
		int charCount = 0;
		int charCount2 = 0;
		File sample = new File("src/hw7/Sample.txt");
		
		FileReader fr = new FileReader("src/hw7/Sample.txt");
        BufferedReader br = new BufferedReader(fr) ;
        while ((i = br.read()) != -1) {
        	charCount += 1;
        }
        br.close();   
        fr.close();
        
        FileReader fi = new FileReader("src/hw7/Sample.txt");
        BufferedReader bf = new BufferedReader(fi) ;
        String str;
        int lineCount = 0;
        while((str = bf.readLine()) != null) {
        	charCount2 += str.length();
        	lineCount += 1;
        }
        System.out.println("Sample.txt檔案共有" + sample.length() + "個位元組，" + 
        charCount + "個字元(含無法顯示字元)，" + lineCount + "列資料");
        System.out.println("可顯示字元數為" + charCount2 +"個");
        
        bf.close();
        fi.close();

	}

}
