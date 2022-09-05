package com.newlecture.ch4.ex;

import java.util.Arrays;

public class TestApp {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		/*
		 * for(int i=0; i<10; i++) { int num = nums[i]; System.out.printf("%d ", num); }
		 */
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 10; i++)
				if (nums[i] % 2 == 0) {
					System.out.printf("%d ", nums[i]);
				}
			System.out.println();
		}

//		System.out.println(nums[10]);
//		System.out.println(nums[9]);
//		System.out.println(nums[8]);
//		System.out.println(nums[7]);
//		System.out.println(nums[6]);
//		System.out.println(nums[5]);
//		System.out.println(nums[4]);
//		System.out.println(nums[3]);
//		System.out.println(nums[2]);
//		System.out.println(nums[1]);
//		System.out.println(nums[0]);
	}
}
