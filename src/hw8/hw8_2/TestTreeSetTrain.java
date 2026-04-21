package hw8.hw8_2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//不重複且由大到小排序
public class TestTreeSetTrain {
	public static void main(String[] args) {
		Set<Train> train = new TreeSet<Train>();

		train.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		train.add(new Train(118, "自強", "高雄", "台北", 500));
		train.add(new Train (1288, "區間", "新竹", "基隆", 400));
		train.add(new Train(122, "自強", "台中", "花蓮", 600));
		train.add(new Train(1222, "區間", "樹林", "七堵", 300));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		for(Train t : train) {
			System.out.println("班次：" + t.getNumber() + " 車種：" + t.getType() + " 出發地：" + t.getStart() +
					" 目的地：" + t.getDest() + " 票價：" + t.getPrice());
		}
		
		System.out.println("========================");
		
		Iterator<Train> it = train.iterator();
		while(it.hasNext()) {
			Train t = it.next();
			System.out.println("班次：" + t.getNumber() + " 車種：" + t.getType() + " 出發地：" + t.getStart() +
					" 目的地：" + t.getDest() + " 票價：" + t.getPrice());
		}
		
		
		
		
	}
}
