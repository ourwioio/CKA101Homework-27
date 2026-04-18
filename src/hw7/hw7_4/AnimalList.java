package hw7.hw7_4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AnimalList {
	public static void main(String[] args) throws Exception {
		File data = new File("src/hw7/hw7_4/data");
		File obj = new File("src/hw7/hw7_4/data/Object2.ser");
		
		if(!data.exists()) {
			data.mkdir();
		}
		
		List<ISpeak> pet = new ArrayList<ISpeak>();
		pet.add(new Dog("小狗1"));
		pet.add(new Dog("小狗2"));
		pet.add(new Cat("小貓1"));
		pet.add(new Cat("小貓2"));
		
		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(int i = 0; i < pet.size(); i++) {
			oos.writeObject(pet.get(i));
		}
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(obj);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while(true) {
				((ISpeak) ois.readObject()).speak();
			}
		}catch(EOFException e) {
			System.out.println("資料讀完～");
		}
		
		ois.close();
		fis.close();
		
	}

}
