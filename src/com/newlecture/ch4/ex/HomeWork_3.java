package com.newlecture.ch4.ex;

public class HomeWork_3 {
	public static void main(String[] args) {

		// 3. 주어진 배열을 역순으로 정렬하기
		
		//기존
		int[] nums = new int[] { 4, 1, 3, 10, 5, 7, 6, 2, 9, 8 };
		
		//정렬 중..
		for (int j=0; j<9; j++)
			for (int i=0; i<9-j; i++) {
				int temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}

		//정렬 후
		for (int i=0; i<nums.length; i++)
			System.out.printf("%d ", nums[i]);
	}
}
