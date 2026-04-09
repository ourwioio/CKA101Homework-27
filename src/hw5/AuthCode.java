package hw5;

public class AuthCode {
//	private static String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//	
//	public static void genAuthCode() {
//		System.out.println("本次隨機產生驗證碼為：");
//		for(int i = 0; i < 8; i++) {
//			char authCode = code.charAt((int) (Math.random() * 62));
//			System.out.print(authCode);
//		}
//	}
	
	
	public static void genAuthCode() {
		
		System.out.println("本次隨機產生驗證碼為：");
		for(int i = 0; i < 8; i++) {
			char code = ( (char) (Math.random() * 123));
			if(((code > 47 && code < 58) || (code > 64 && code < 91)) || (code > 96 && code < 123)) {
				System.out.print(code);
			}else {
				i--;
				continue;
			}
		}
	}

	public static void main(String[] args) {
		AuthCode.genAuthCode();
	}
	
	
}
