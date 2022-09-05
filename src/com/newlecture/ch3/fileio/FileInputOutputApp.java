package com.newlecture.ch3.fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputApp {

	public static void main(String[] args) throws IOException { //예외처리
		FileOutputStream fout = new FileOutputStream("C:\\workspace\\Java3rdPrj\\res\\data.txt"); // 파일로 바이트 단위의 출력을 내보내는 클래스
																								  // 주어진 File 객체가 가리키는 파일을 쓰기 위한 객체를 생성.
		 																						  // 기존의 파일이 존재할 때는 그 내용을 지우고 새로운 파일을 생성.
																								  // 데이터를 저장할 파일 경로 지정해주기
		fout.write(51); 
		fout.write(49);
		fout.write(64);
		fout.flush(); //버퍼가 가득 차지 않아도 강제적으로 모두 출력시키고 버퍼를 비워주는 메서드
		fout.close(); //flush() 로 버퍼를 비워준 후, 점유하고 있던 자원을 반환 (버퍼 닫아주기)
		
		System.out.println("파일 저장이 완료 되었습니다!!!");
	}
}
