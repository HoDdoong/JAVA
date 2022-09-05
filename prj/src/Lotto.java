import java.util.*;

public class Lotto {

	public static void main(String[] args) {

		Random rd = new Random();
		int num1 = rd.nextInt(45)+1;
		int num2 = rd.nextInt(45)+1;
		int num3 = rd.nextInt(45)+1;
		int num4 = rd.nextInt(45)+1;
		int num5 = rd.nextInt(45)+1;
		int num6 = rd.nextInt(45)+1;
		int num7 = rd.nextInt(45)+1;
		
		
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃　　　　　　　　　 로또 복권 　　　　　　　　┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println();
		System.out.printf("번호: %d, %d, %d, %d, %d, %d 보너스: %d\n", num1, num2, num3, num4, num5, num6, num7);
		
		
	}

}
