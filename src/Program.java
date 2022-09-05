import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner; //도구를 사용해서 행위를 할 때, 자바 제공하는 기본적인 도구. 스캐너는 자바에서 만든 유틸리티. 

public class Program {
	public static void main(String[] args) throws IOException {

//		int kor1 = 0, kor2 = 0, kor3 = 0;
		int[] kors = new int[3];
		int total = 0;
		float avg;
//		int menu; //변수명은 행위에 의해 만들어지는 값이기 때문에 명사로 해주는 것이 좋고, 함수는 행위명으로 작명하기
		String grade =null;

		Scanner scan = new Scanner(System.in); // System.in은 객체이다.

		ESCAPE:
		while (true) {
			System.out.println("┌────────────┐");
			System.out.println("│　 성적 입력　 │");
			System.out.println("└────────────┘");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 읽기");
			System.out.println("4. 성적 저장");
			System.out.println("5. 프로그램 종료");
			int menu = scan.nextInt(); // 변수는 가능하면 지역화 시키는게 좋다.
										// 변수선언은 연산이 아니기 때문에 반복문 안에 선언이 되는 경우라도 반복적으로 선언되지 않는다.
										// 처음 한번만 선언된다.
			// ( = 와 scan.netxtInt()는 연산에 해당됨 )
			System.out.println("선택 > " + menu);
			
			
			
			switch (menu) {
			case 1:
			// ====================== 성적 입력 부분 ======================= //
			{
				System.out.println("┌────────────┐");
				System.out.println("│　 성적 입력　 │");
				System.out.println("└────────────┘");
				
				System.out.println("이름: ");
				grade = scan.next();
				
				for(int i=0; i<3; i++) 
				do {
					System.out.printf("국어%d: ", i+1);
					kors[i] = scan.nextInt();

					if (kors[i] < 0 || kors[i] > 100)
						System.out.println("성적의 범위(0~100)를 벗어났습니다.");
				} while (kors[i] < 0 || kors[i] > 100);
				
//				
//				System.out.print("kor2:");
//				kor2 = scan.nextInt();
//				System.out.print("kor3:");
//				kor3 = scan.nextInt();
			}
				break;
			// ====================== 성적 출력 부분 ======================= //
			case 2: { //case문 뒤에는 중괄호를 안붙여줘도 되는데, 여기서 붙여준 이유는 지역화를 시키기 위해
				// 변수의 초기화: 초기화 하지 않았을 때 오류를 내기 위한 오류값을 설정하거나, 입력하지 않았을 때 사용할 기본값을 넣어주거나
				//
				for(int i=0; i<3; i++)
					total += kors[i];
//				total = kors[0] + kors[1] + kors[2];
				
				avg = total / 3.0f; // 정수 나누기 정수 = 정수, 정수 나누기 실수 = 실수

				System.out.println("┌────────────┐");
				System.out.println("│　 성적 입력　 │");
				System.out.println("└────────────┘");


				for (int i = 0; i < 3; i++) {
					System.out.printf("----------------%d번째------------------\n", 3 - i);
					for(int j=0; j<3; j++) { // 특정반복을 위한 임시변수 i를 for문 안에서 직접 선언하면 외부에 있는 다른 변수들과 충돌날 일이 없어서 좋다.
					System.out.printf("국어%d: %d\n", j+1, kors[j]);
					}
					System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
					System.out.printf("총점: %d\n", total);
					System.out.printf("평균: %f\n", avg);
					System.out.println("──────────────────────────────────────");
				}	
			}
				break;
				
			case 3: //읽기
			{ //fis 는 case3 에서만 사용될 것이므로 지역화 시키기 위한 중괄호
				FileInputStream fis = new FileInputStream("res/data.csv");
				Scanner fscan = new Scanner(fis);
				
				grade = fscan.nextLine(); // 엑셀 파일에서 문자열 "kor" 읽기
				for(int i=0; i<3; i++)
				kors[i] = Integer.parseInt(fscan.nextLine()); // 엑셀 파일에서 문자열 "10"을 읽어온 후 int형으로 형변환
//				kor2 = Integer.parseInt(fscan.nextLine()); // 엑셀 파일에서 문자열 "60"을 읽어온 후 int형으로 형변환
//				kor3 = Integer.parseInt(fscan.nextLine()); // 엑셀 파일에서 문자열 "80"을 읽어온 후 int형으로 형변환

				fscan.close();	// 내가 만들고 여기서만 쓰일 자원은 사용 후 close를 해주어야한다.
				fis.close();
			}	
				break;
				
			case 4:
			{
				FileOutputStream fos = new FileOutputStream("res/data.csv");
				PrintStream fscan = new PrintStream(fos);
				
				fscan.println(grade);
				for(int i=0; i<3; i++)
					fscan.println(kors[i]);
//				fscan.println(kor2);
//				fscan.println(kor3);
				
				fos.close();
				fscan.close();
			} 
				break;
				
			case 5: 
				System.out.println("프로그램을 종료합니다. Bye Bye~★");
			    break ESCAPE;
			    
			    default:
			    	System.out.println("1, 2, 3 중 하나만 입력하세요.");
			    	break;
			}
		}
	}
}