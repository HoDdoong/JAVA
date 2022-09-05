package com.newlecture.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyApp5 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\workspace\\Java3rdPrj\\res\\test.java");
		FileOutputStream fout = new FileOutputStream("C:\\workspace\\Java3rdPrj\\res\\test_copy.java");

		int count = 0;

		while (true) {
			int x = fin.read();
			fout.write(x);
			count++;
			System.out.print(count);
			
			//파일에서 첫번째 중괄호의 위치를 찾아서 출력해보기
			if (x == '{') {
				System.out.println(" ===> '{' 가 있는 위치: " + count);
				break;
			}
			if (x == -1)
				break;
		}
		fout.flush();
		fout.close();
		System.out.println("파일 복사가 완료 되었습니다!!!");
	}
}