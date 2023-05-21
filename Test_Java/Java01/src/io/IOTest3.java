package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//텍스트 파일 읽기
public class IOTest3 {

	public static void main(String[] args) {
		 FileReader in = null;
		 int ch;
		 
		 try {
			 in = new FileReader("C:\\workspace\\Test_Java\\Java01\\src\\school\\Student.java");
		 }catch(FileNotFoundException e)
		 {
			 System.out.println("파일이 없습니다.");
			 return;
		 }
		 
		 try {
			 while((ch = in.read()) != -1) {	//파일에서 1문자 읽기, char타입을 변환하지 않으면..?
				 
			 System.out.print((char)ch);
			 
			 }
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 
		 try {
			 in.close();
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 
	}
}
