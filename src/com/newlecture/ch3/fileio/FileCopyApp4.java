package com.newlecture.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyApp4 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\workspace\\Java3rdPrj\\res\\test.java");
		FileOutputStream fout = new FileOutputStream("C:\\workspace\\Java3rdPrj\\res\\test_copy.java");

		while (true) {
			int x = fin.read();

			//파일에서 공백 제거하기
			if (x != ' ')
				fout.write(x);

			if (x == -1)
				break;
		}

		fout.flush();
		fout.close();
		fin.close();
		System.out.println("파일 복사가 완료 되었습니다!!!");
	}
}