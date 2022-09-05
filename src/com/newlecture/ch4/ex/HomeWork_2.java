package com.newlecture.ch4.ex;

public class HomeWork_2 {
	public static void main(String[] args) {
		int i, j;

		// 2. 구구단 2단부터 9단까지 출력하기
		// index 값을 유지한 코드
		for(i=0; i<8; i++) {
			System.out.printf("♡-----%d단-----♡\n", i+2);
			for(j=0; j<9; j++) 
			System.out.printf("　%d X %d = %d\n", i+2, j+1, (i+2)*(j+1));
		}

		// index 값을 유지하지 않은 코드
//		for (i=2; i<10; i++) {
//			System.out.printf("♡-----%d단-----♡\n", i);
//			for (j=1; j<10; j++)
//				System.out.printf("　%d X %d = %d\n", i, j, i * j);
//		}
	}
}
