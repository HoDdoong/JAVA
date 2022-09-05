import java.util.Random;

public class rd {

	   public static void main(String[] args) {
		      int num;
		      Random rand = new Random();
		      num = rand.nextInt(45)+1;
		      //rand.nextInt(45) 45개의 범위 , 즉 0~44의 숫자값 생성
		      //1~45의 범위가 나오고싶다면 +1을 해주면 된다.
		      System.out.println(num);
		      num = rand.nextInt();
		      System.out.println(num);
		   }

		}
