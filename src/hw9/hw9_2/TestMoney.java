package hw9.hw9_2;

class Wallet {
	private int balance = 0;

	synchronized public void safeMoney(int money) {
		if (balance >= 3000) {
			try {
				System.out.println("媽媽看到餘額在3000以上，暫停匯款");
				System.out.println("熊大被媽媽告知帳戶已經有錢");
				// 因為熊大只有領10次只有1萬元，媽媽存10次有2萬元，錢沒人領程式進入死結。
				// 在wait()內加入參數讓媽媽等不到人領錢會醒來做接下去的動作，避免死結。
				wait(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		balance += money;
		System.out.println("媽媽存了" + money + " 帳戶餘額：" + balance);
		notify();
	}

	synchronized public void spendMoney(int money) {
		while (balance < money) {
			try {
				System.out.println("熊大到看到帳戶沒錢暫停提款");
				System.out.println("媽媽被熊大要求匯款！");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			balance -= money;
			System.out.println("熊大領了" + money + " 帳戶餘額：" + balance);
		} else {
			balance -= money;
			System.out.println("熊大領了" + money + " 帳戶餘額：" + balance);
		}
		notify();

	}
}

class Mother extends Thread {
	Wallet wt;

	public Mother(Wallet wt) {
		this.wt = wt;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			wt.safeMoney(2000);
	}
}

class Son extends Thread {
	Wallet wt;

	public Son(Wallet wt) {
		this.wt = wt;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			wt.spendMoney(1000);
	}
}

public class TestMoney {
	public static void main(String[] args) {
		Wallet wt = new Wallet();
		Mother mother = new Mother(wt);
		Son son = new Son(wt);
		mother.start();
		son.start();
	}

}
