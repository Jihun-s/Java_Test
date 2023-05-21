package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest5 {
	public static void main(String[] args) {
		BufferedReader br = null;
		int ch;
		String s;
		try {
			br = new BufferedReader(new FileReader("C:\\workspace\\Test_Java\\Java01\\src\\school\\Student.java"));
		 }catch(FileNotFoundException e)
		 {
			 System.out.println("파일이 없습니다.");
			 return;
		 }
		try {
			s = br.readLine();		//.in.read은 1바이트씩 가져옴. 비효율적
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
