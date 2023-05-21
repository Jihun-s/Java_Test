package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//복사
public class IOTest6 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		int i;
		String inFilename, outFilename;
		File inFile, outFile;
		Scanner sc = new Scanner(System.in);
		
		//원본파일
		System.out.print("원본 파일명: ");
		inFilename = sc.nextLine();
		inFile = new File(inFilename);
		if(!inFile.isFile())
		{
			System.out.println(inFilename+"파일이 없습니다.");
			return;
		}
		in = new FileInputStream(inFilename);
		
		
		
		//대상파일
		System.out.print("만들 파일명: ");
		outFilename = sc.nextLine();
		outFile = new File(outFilename);
		if(!inFile.isFile())
		{
			System.out.println(outFilename+"이미 존재하는 파일명입니다. 덮어쓰시겠습니까?(y/n)");
			if(sc.nextLine().equals("n"))
				{return;}
		}
		out = new FileOutputStream(outFilename);
		
		i = in.read();
		while((i = in.read()) != -1)	//내용이 없으면 -1, 전체복사
		{
			out.write(i);		//-1바이트 복사함.
		}
		in.close();
		out.close();
		
		
	}
}
