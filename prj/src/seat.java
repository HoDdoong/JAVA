import java.io.IOException;
import java.util.Scanner;

public class seat {
	public static void main(String[] args) throws IOException {

		{
			int code = System.in.read(); // 내가 입력하는건 숫자지만 버퍼에는 문자로 입력된다.
										// read는 입력값에서 Enter키까지 읽는다.
			System.out.println("첫번째입력값_println(): "+code); // 50을 입력했을 때 print와 write의 출력값이 다르다. //문자열 출력
			
			System.out.write(code); // println 에서 입력된 5 //바이너리 출력
			System.out.println();
			System.out.flush();
		}

		{
			char code = (char)System.in.read(); // 내가 입력하는건 숫자지만 버퍼에는 문자로 입력된다.
			System.out.println("두번째입력값: " + code); // 50을 입력했을 때 print와 write의 출력값이 다르다. //문자열 출력

			System.out.write(code); // println 에서 입력된 5 //바이너리 출력
			System.out.println();
			System.out.flush();
		}

		{
			int code = System.in.read(); // 내가 입력하는건 숫자지만 버퍼에는 문자로 입력된다.
			System.out.println("세번째입력값: "+ code); // 50을 입력했을 때 print와 write의 출력값이 다르다. //문자열 출력
			System.out.write(code); // println 에서 입력된 5 //바이너리 출력
			System.out.flush();
		}
	}
}
