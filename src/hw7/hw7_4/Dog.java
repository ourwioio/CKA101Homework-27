package hw7.hw7_4;

import java.io.Serializable;

public class Dog implements Serializable, ISpeak{
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
