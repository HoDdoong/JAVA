package com.newlecture.ch4.ex;

public class HomeWork_4 {
	public static void main(String[] args) {

		// 4. 규칙이 있는 숫자 출력하기
		int[] nums = new int[5];

		for (int j=0; j<5; j++) {
			for (int i=0; i<5; i++) {
				nums[i] = i+j+1;
				System.out.printf("%d", nums[i]);
			}
			System.out.println();
		}
	}
}