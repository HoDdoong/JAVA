package com.newlecture.ch4.ex;

public class HomeWork_1 {
	public static void main(String[] args) {

		// 1. 길이가 10인 배열을 1부터 10까지 초기화하고 합을 구하기
		int[] nums = new int[10];
		int total = 0;

		System.out.print("배열: ");
		
		for (int i=0; i<10; i++) {
			nums[i] = i+1;
			total += nums[i];
			System.out.printf("%d ", nums[i]);
		}
		System.out.printf("\n합: %d", total);
	}

}
