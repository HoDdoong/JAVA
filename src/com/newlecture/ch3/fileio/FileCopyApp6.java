package com.newlecture.ch3.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyApp6 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\workspace\\Java3rdPrj\\res\\source.java");
		FileOutputStream fout = new FileOutputStream("C:\\workspace\\Java3rdPrj\\res\\source_copy.java");

		int x = fin.read();
		int count = 0;

		while (x >= 0) {
			if (x == '\n' || x == '\r') {
				x = fin.read();
				continue;
			}
			fout.write(x);
			x = fin.read();
			
			count++;
		}
		fout.flush();
		fout.close();
		fin.close();
		System.out.println("문자열의 총 갯수는 " +count+"개 입니다.");
	}
}