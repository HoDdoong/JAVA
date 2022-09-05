package baekjoon;

import java.util.Scanner;

public class q14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y 좌표값을 입력해 주세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// 1사분면: x양, y양
		// 2사분면: x음, y양
		// 3사분면: x음, y음
		// 4사분면: x양, y음
		
		if(x>0 && y>0) 
			System.out.println("제 1사분면");
		  else if (x<0 && y>0) 
			System.out.println("제 2사분면");
		  else if (x<0 && y<0) 
			System.out.println("제 3사분면");
		  else 
			System.out.println("제 4사분면");
	}
}
