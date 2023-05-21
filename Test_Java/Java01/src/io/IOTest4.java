package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader in = null; File b;
		int ch;
		while(true)
		{
			System.out.print("읽을 파일: ");
			String a = sc.next();
			try {
				 in = new FileReader(a);
			 }catch(FileNotFoundException e)
			 {
				 System.out.println("파일이 없습니다. 다시 입력하세요.");
				 continue;
			 }
			b = new File(a);
			if(b.exists())
			{
				break;
			}
		}
		try {
			 while((ch = in.read()) != -1) {	//파일에서 1문자 읽기
			 System.out.print((char)ch);
			 }
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 
		System.out.println("-----읽은 내용 출력");
		System.out.println("총 " + b.length()+ "bytes");
		try {
			 in.close();
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
	}
}
//시작시 읽을 파일: ex) c:\aaa.txt
//없으면 파일이 없습니다. 다시 입력하세요.
//읽을 파일 : //
// ----- 읽은 내용 출력

//총  xxx bytes
