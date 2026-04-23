package hw9.hw9_2;

class WantMoney {
	private static int balance = 0;

	synchronized public void safeMoney(int money) {
		balance += money;
		System.out.println("媽媽存了" + money + " 帳戶餘額：" + balance);
		if (balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				System.out.println("熊大被媽媽告知帳戶已經有錢");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
	}

	synchronized public void spendMoney(int money) {

		while (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			balance -= money;
			System.out.println("熊大領了" + money + " 帳戶餘額：" + balance);
			if (balance == 0) {
				System.out.println("熊大看到餘額在2000以下，要求匯款");
				System.out.println("熊到看到帳戶沒錢暫停提款");
				try {
					System.out.println("媽媽被熊大要求匯款！");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		balance -= money;
		System.out.println("熊大領了" + money + " 帳戶餘額：" + balance);
		notify();
	}
}

class Mother extends Thread {
	WantMoney wm;

	public Mother(WantMoney wm) {
		this.wm = wm;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			wm.safeMoney(2000);
	}
}

class Son extends Thread {
	WantMoney wm;

	public Son(WantMoney wm) {
		this.wm = wm;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			wm.spendMoney(1000);
	}
}

public class TestMoney {
	public static void main(String[] args) {
		WantMoney wm = new WantMoney();
		Mother mother = new Mother(wm);
		Son son = new Son(wm);
		mother.start();
		son.start();

	}

}
