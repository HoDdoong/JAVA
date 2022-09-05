import java.util.Scanner; //도구를 사용해서 행위를 할 때, 자바 제공하는 기본적인 도구. 스캐너는 자바에서 만든 유틸리티. 

public class Program {
	public static void main(String[] args) {

		int kor, math, eng;
		int total;
		float avg;

		Scanner scan = new Scanner(System.in); // System.in은 객체이다.
		
		while(true)
		{
		System.out.print("kor:");
		kor = scan.nextInt();
		System.out.print("math:");
		math = scan.nextInt();
		System.out.print("eng:");
		eng = scan.nextInt();

		
		
		total = kor + math + eng;
		avg = total / 3.0f; // 정수 나누기 정수 = 정수, 정수 나누기 실수 = 실수

//System.out.printf("total is %d\n", total);
//System.out.printf("avg is %f\n", avg);

		System.out.println("┌────────────────────────────────────┐");
		System.out.println("│                                    │");
		System.out.println("│　　　　　　　　성적출력 　　　　　　　   │");
		System.out.println("│                                    │");
		System.out.println("└────────────────────────────────────┘");
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.printf("국어: %d\n", kor); // \" => '"'
		System.out.printf("수학: %d\n", math); // \\ => '\'
		System.out.printf("영어: %d\n", eng);
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println("총점: " + total);
		System.out.printf("평균: %5.2f\n", avg); // 소수점을 포함한 5자리를 출력하라고 했으나 그에 할당되는 값이 5자리를 초과할 경우, 값이 잘리는게 아닌 전체가 출력된다.
		System.out.println("──────────────────────────────────────");
		}
		
	}
}

//자리를 바꾸고, 자리를 바꾼결과의 화면을 출력하기