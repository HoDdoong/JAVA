package com.newlecture.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyApp {
	public static void main(String[] args) throws IOException { 
		FileInputStream fin = new FileInputStream("C:\\workspace\\Java3rdPrj\\res\\test.java"); // 입력 스트림 객체 생성.
		FileOutputStream fout = new FileOutputStream("C:\\workspace\\Java3rdPrj\\res\\test_copy.java"); // 복사본을 만들 출력 스트림 객체 생성.

		/********* 반복 시작 **********/
		while (true) {
			int x = fin.read(); //리턴 값이 실제 바이트가 될수도 -1이 될수도 있다.
//			System.out.println(x);
			
			if(x==-1) 
				break; // 실행문이 한문장이면 중괄호를 쓰지 않는 것이 좋다.				
		
			fout.write(x);
		}
		/********* 반복 종료 **********/
		
		
		fout.flush(); // 버퍼가 가득 차지 않아도 강제적으로 모두 출력시키고 버퍼를 비워주는 메서드
		fout.close(); // flush() 로 버퍼를 비워준 후, 점유하고 있던 자원을 반환 (버퍼 닫아주기)
		fin.close();

		System.out.println("파일 복사가 완료 되었습니다!!!");
	}
}