package hw7.hw7_4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Anamal {
	public static void main(String[] args) throws Exception {
		
		File data = new File("src/hw7/hw7_4/data");
		File f1 = new File(data, "Object.ser");
		//如果沒有目錄就創建
		if(!data.exists()) {
			data.mkdir();
		}
		
		ISpeak[] animal = new ISpeak[4];
		animal[0] = new Dog("小狗1");
		animal[1] = new Dog("小狗2");
		animal[2] = new Cat("小貓1");
		animal[3] = new Cat("小貓2");
		
		//輸出
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(int i = 0; i < animal.length; i++) {
			oos.writeObject(animal[i]);			
		}
		oos.close();
		fos.close();
		
		//輸入
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while (true) {
				((ISpeak) ois.readObject()).speak();
			}
		} 
		//檔案讀完把例外接下
		catch (EOFException e) {
			System.out.println("資料讀完～");
		}
		
		ois.close();
		fis.close();
			
	}

}
