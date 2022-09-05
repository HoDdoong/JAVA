package com.newlecture.ch4.ex;
import java.util.Random;

public class LottoApp {

	public static void main(String[] args) {
		// 1. 정수 배열 lotto를 생성 및 선언
		int[] lotto = new int[6];
		Random rd = new Random();
		
		// 2. 랜덤 값 6개를 넣는다. 값의 범위는 1~45 이다.
		// 3. 배열의 값을 출력하기
		for(int i=0; i<6; i++) {
			lotto[i] = rd.nextInt(45)+1;
			System.out.printf("%d ", lotto[i]);
		}
		
		//버블 정렬 방식.
	  for(int j=0; j<5; j++) {
		for(int i=0; i<5-j; i++) 
			if(lotto[i]>lotto[i+1]){
				int imsi = lotto[i];
				lotto[i]= lotto[i+1];
				lotto[i+1] = imsi;
			}
	}
		
		System.out.println();
		System.out.print("바뀐 로또 번호는: ");
		
		// 5. 배열의 값을 출력하기
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%d ", lotto[i]);
		}
	}
}

/*
 * // 4. 배열에서 1번째 값과 2번째 공간의 값을 바꾸기 // 4-1. 임시 공간을 마련한다. // 4-2. A 공간의 값을 임시변수에
 * 옮긴다. // 4-3. B 공간의 값을 A 공간에 옮긴다. // 4-4. 임시공간의 값을 B 공간에 옮긴다.
 * int imsi = lotto[0]; lotto[0]=lotto[1]; lotto[1]=imsi;
 */
//		for(int i=0; i<4; i++) 
//			if(lotto[i]>lotto[i+1]){
//				int imsi = lotto[i];
//				lotto[i]= lotto[i+1];
//				lotto[i+1] = imsi;
//			}
//		
//		for(int i=0; i<3; i++) 
//			if(lotto[i]>lotto[i+1]){
//				int imsi = lotto[i];
//				lotto[i]= lotto[i+1];
//				lotto[i+1] = imsi;
//			}
//		
//		for(int i=0; i<2; i++) 
//			if(lotto[i]>lotto[i+1]){
//				int imsi = lotto[i];
//				lotto[i]= lotto[i+1];
//				lotto[i+1] = imsi;
//			}