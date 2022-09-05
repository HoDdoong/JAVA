import java.util.Arrays;
import java.util.Random;

public class Lotto_2 {

	public static void main(String[] args) {
		Random rd = new Random();
		int num[] = new int[7];
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃　　　　　　　　　 로또 복권 　　　　　　　　┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println();
		System.out.print("번호: ");

		for(int i=0; i<num.length;i++) {
			num[i] = rd.nextInt(45)+1;
			System.out.print(num[i] + " ");
			}
		
		} 
//	}
//		System.out.println("보너스: " + num[7]);
//		System.out.println("번호: "+Arrays.toString(num));

}
