package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw8_1 {
	public static void main(String[] args) {
		List c = new ArrayList();
		c.add(new Integer(100));
		c.add(new Double(3.14));
		c.add(new Long(21));
		c.add(new Short((short) 100));
		c.add(new Double(5.1));
		c.add("Kitty");
		c.add(new Integer(100));
		c.add(new Object());
		c.add("Snoopy");
		c.add(new BigInteger("1000"));
		
//		Iterator it = c.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		
//		for(int i = 0; i < c.size(); i++) {
//			Object obj = c.get(i);
//			System.out.println(obj);
//		}
//		
		for(Object obj : c) {
			System.out.println(obj);
		}
		
		System.out.println("===========把Number類別的物件移除===========");
		//利用迭代器把Number類別的物件移除
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj instanceof Number){
				it.remove();
			}else {
				System.out.println(obj);
			}
		}		
	}
}