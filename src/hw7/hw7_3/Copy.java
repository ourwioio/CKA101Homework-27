package hw7.hw7_3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	
	private File inputFile;
	private File outputFile;
	
	public Copy(File inputFile, File outputFile) {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
	}
	
	public void copyFile() throws IOException {
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		int c;
		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
			out.write(c);
			System.out.print((char) c);
			System.out.flush();
		}
		
		in.close();
		out.close();
		
	}
}
