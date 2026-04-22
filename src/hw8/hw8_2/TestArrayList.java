package hw8.hw8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//有重複且由大到小排序
public class TestArrayList {
	public static void main(String[] args) {
		List<Train> train = new ArrayList<Train>();

		// 建立比較器，班次由大到小排序
		Comparator<Train> c = new Comparator<Train>() {
			public int compare(Train a, Train b) {
				return b.getNumber() - a.getNumber();
			}
		};

		train.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		train.add(new Train(118, "自強", "高雄", "台北", 500));
		train.add(new Train(1288, "區間", "新竹", "基隆", 400));
		train.add(new Train(122, "自強", "台中", "花蓮", 600));
		train.add(new Train(1222, "區間", "樹林", "七堵", 300));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));

		// 使用比較器
		Collections.sort(train, c);

//		Iterator<Train> it = train.iterator();
//		while(it.hasNext()) {
//			Train t = it.next();
//			System.out.println("班次：" + t.getNumber() + " 車種：" + t.getType() + " 出發地：" + t.getStart() +
//					" 目的地：" + t.getDest() + " 票價：" + t.getPrice());
//		}	

//		for(Train t : train) {
//			System.out.println("班次：" + t.getNumber() + " 車種：" + t.getType() + " 出發地：" + t.getStart() +
//					" 目的地：" + t.getDest() + " 票價：" + t.getPrice());
//		}

		for (int i = 0; i < train.size(); i++) {
			Train t = train.get(i);
			System.out.println("班次：" + t.getNumber() + " 車種：" + t.getType() + " 出發地：" + t.getStart() + " 目的地："
					+ t.getDest() + " 票價：" + t.getPrice());
		}

	}
}
