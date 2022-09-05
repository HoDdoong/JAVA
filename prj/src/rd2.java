import java.util.Random;

public class rd2 {
	public static void main(String[] args) {
//		int num;
//		Random rd = new Random();
//		num = rd.nextInt(100)+1;
//		boolean b = num%2 == 1;
//		System.out.printf("%d: %b\n", num, b);
		
		int num;
		Random rd = new Random();
		num = rd.nextInt(100)+1;
		boolean b = num%3 == 1;
			System.out.printf("%d: %b\n", num, b);			
		
		
//		if(b == true) {
//			String b2 = "3의 배수임";
//			System.out.printf("%d: %s\n", num, b2);			
//		} else {
//			String b2 = "3의 배수가 아님";
//			System.out.printf("%d: %s\n", num, b2);			
//		}
	}
}
