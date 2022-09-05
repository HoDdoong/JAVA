package com.newlecture.ch3.fo;

import javax.security.auth.callback.ConfirmationCallback;

public class ForTest1 {

	public static void main(String[] args) {
		
		/***********************************************	
		 * // 문제1) for문을 이용하여 1을 10번 출력하는 코드를 작성하기
		 * for (int i = 0; i < 10; i++) 
		 * 		System.out.printf("%d ", 1);
		 ***********************************************/
		
		/*********************************************
		 * //문제2) for문을 이용하여 1부터 10까지 출력하는 코드를 작성하기
		 * for (int i = 0; i < 10; i++)
		 * 		System.out.printf("%d ", i+1);
		 *********************************************/
		
		/*********************************************
		 * //문제3) for문을 이용하여 3부터 7까지 5개의 숫자를 출력하는 코드를 작성하기 (3, 4, 5, 6, 7)
		 * for (int i = 0; i < 5; i++)
		 *	    System.out.printf("%d ", i+3);
		 *********************************************/
 
		/*********************************************
		* //문제4) for문을 이용하여 20개의 숫자가 다음처럼 출력하는 코드를 작성하시오
		* for (int i=0; i<20; i++)
		*	   System.out.printf("%d ", (i*3)+2);
		**********************************************/
		
//		  //문제5)
//		for(int i=0; i<100; i++) {
//			System.out.printf("%c", '┼');
//			if((i+1)%10==0) //i%10==9
//				System.out.printf("%c", '\n');
//		}
//		
		 //문제6)
//		for(int n=1; n<=100; n++) {
//			if(n%10==1)
//				System.out.printf("%c", '○');
//			else	
//				System.out.printf("%c", '┼');
//			
//			if(n%10==0) //i%10==9
//				System.out.println();
//		}
		
//			for (int y=1; y<=10; y++) { // y축
//				for (int x=1; x<=10; x++) { // x축
//					if (x==13-y)//y가 1일때 x는 10 / y2-x9 / ... ///10, 19, 28, 37, .... (+9 + ) y==10+(y-1)9
//						System.out.printf("%c", '●');
//					else if (x==1)
//						System.out.printf("%c", '○');
//					else
//						System.out.printf("%c", '┼');
//				}
//				System.out.println();
//			}
		
		
		
		for (int y=1; y<=11; y++) {
			for (int x=1; x<=11; x++) 
				if (x>=12-y && x <= y) 
					System.out.printf("%c", '●');
				else
					System.out.printf("%c", '┼');
			
				System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		for (int y=1; y<=13; y++) { // y축
			if(y==1) 
				System.out.printf("%s", "┏┳┳┳┳┳┳┳┳┳┳┳┓");
			else if (y==13) 
				System.out.printf("%s", "┗┻┻┻┻┻┻┻┻┻┻┻┛");
			else 
			 System.out.printf("%s", "┣╋╋╋╋╋╋╋╋╋╋╋┫");
			System.out.println();
		}


		//나중에 너비,길이를 늘리거나 줄여야하는 경우를 생각해서 너비,길이값을 변수로 따로 생성하여 처리하는 것이
		//더 좋은 코드. (유지보수를 위해)
		// int width = 13; //x축
		// int height = 13; // y축
//		for (int y=1; y<=height; y++) { // y축
//		for (int x=1; x<=width; x++)  // x축
//		 if (x==1 && y==1) 
//			System.out.printf("%c", '┌');
//		 else if(x==width && y==1) 
//			 System.out.printf("%c", '┐');
//		 else if(x==1 && y==height) 
//			 System.out.printf("%c", '└');
//		 else if(x==width && y==height) 
//			 System.out.printf("%c", '┘');
//		 else if(x==1)
//			 System.out.printf("%c", '├');
//		 else if(x==width)
//			 System.out.printf("%c", '┤');
//		 else if(y==1)
//			 System.out.printf("%c", '┬');
//		 else if(y==height)
//			 System.out.printf("%c", '┴');
//		else
//			System.out.printf("%c", '┼');
//		
//					System.out.println();
//		}
		
		
		
//		for (int y=1; y<=13; y++) { // y축
//			for (int x=1; x<=13; x++)  // x축
//			 if (x==1 && y==1) 
//				System.out.printf("%c", '┌');
//			 else if(x==13 && y==1) 
//				 System.out.printf("%c", '┐');
//			 else if(x==1 && y==13) 
//				 System.out.printf("%c", '└');
//			 else if(x==13 && y==13) 
//				 System.out.printf("%c", '┘');
//			 else if(x==1)
//				 System.out.printf("%c", '├');
//			 else if(x==13)
//				 System.out.printf("%c", '┤');
//			 else if(y==1)
//				 System.out.printf("%c", '┬');
//			 else if(y==13)
//				 System.out.printf("%c", '┴');
//			else
//				System.out.printf("%c", '┼');
//			
//						System.out.println();
//			}
	}
}