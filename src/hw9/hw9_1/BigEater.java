package hw9.hw9_1;

public class BigEater implements Runnable{
	private String name;
	int rice = 1;
	public static boolean ready = false;
	
	public BigEater(String name) {
		this.name = name;
	} 
	
	@Override
	public void run() {
		while(!ready) {
		}	
		while(rice <= 10) {
			int random = (int)((Math.random()) * 2501) + 500;
			try {
				Thread.sleep(random);
				System.out.println(name +"吃了第" + rice + "碗飯");
				rice++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}		
		System.out.println(name + "吃完了!");
	}
	
	public static void main(String[] args) {
		BigEater p1 = new BigEater("饅頭人");
		BigEater p2 = new BigEater("\t\t詹姆士");
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		System.out.println("-----大胃王快食比賽開始-----");
		t1.start();
		t2.start();
		
		BigEater.ready = true;
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束!-----");
		
	}
}
