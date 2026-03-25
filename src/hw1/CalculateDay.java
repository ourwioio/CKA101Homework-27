package hw1;

public class CalculateDay {
	public static void main(String[] args) {
		
		int totalsec = 256559;
		int days = totalsec / 86400, remDay = totalsec % 86400; //60 * 60 * 24
		int hours = remDay / 3600, remHour = remDay % 3600;
		int minutes = remHour / 60, seconds = remHour % 60;		
		System.out.println("256559秒是" + days + "天" + hours + "小時" + minutes + "分鐘" + seconds + "秒" );
		
	}

}
