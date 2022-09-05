package com.newlecture.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyApp2 {
	public static void main(String[] args) throws IOException { 
		FileInputStream fin = new FileInputStream("C:\\workspace\\Java3rdPrj\\res\\test.java"); // 입력 스트림 객체 생성.
		FileOutputStream fout = new FileOutputStream("C:\\workspace\\Java3rdPrj\\res\\test_copy.java"); // 복사본을 만들 출력 스트림 객체 생성.

//		int count = 0;
		
		while (true) {
			int x = fin.read();
//			System.out.println(x);
			
			if (x==-1)
				break;

			if(x!='\n' && x!='\r') // 파일 중에 개행처리 개수 구하기. (x==13 으로 조건을 줘도 된다.)
				fout.write(x);
			
//			fout.write(x);
		}

		fout.flush();
		fout.close();
		fin.close();
		
		System.out.println("파일 복사가 완료 되었습니다!!!");
	}
}