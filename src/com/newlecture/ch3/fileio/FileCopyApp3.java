package com.newlecture.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyApp3 {
	public static void main(String[] args) throws IOException { 
		FileInputStream fin = new FileInputStream("C:\\workspace\\Java3rdPrj\\res\\test.java"); // 입력 스트림 객체 생성.
		FileOutputStream fout = new FileOutputStream("C:\\workspace\\Java3rdPrj\\res\\test_copy.java"); // 복사본을 만들 출력 스트림 객체 생성.

		while (true) {
			int x = fin.read();
			fout.write(x);
			
			//소문자 n을 찾으면 옆에 N을 추가하기
			if(x=='n')
				fout.write('N');
			
			if(x==-1) 
				break;
		}

		fout.flush(); 
		fout.close();
		fin.close();
		System.out.println("파일 복사가 완료 되었습니다!!!");
	}
}