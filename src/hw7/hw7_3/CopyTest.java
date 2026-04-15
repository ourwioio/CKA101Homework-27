package hw7.hw7_3;

import java.io.File;
import java.io.IOException;

public class CopyTest {
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("src/hw7/hw7_3/Sample.txt");
		File f2 = new File("src/hw7/hw7_3/SampleCopy.txt");
		Copy c1 = new Copy(f1, f2);
		c1.copyFile();
				
	}
}
