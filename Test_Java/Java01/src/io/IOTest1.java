package io;

import java.io.File;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) {
		File a = new File("a.txt");
		File b = new File("sub");
		
		System.out.println(a.exists());			//존재유무
		System.out.println(a.isFile());			//있다면 그것이 파일인지
		System.out.println(a.isDirectory());	//디렉토리로 존재하면 true
		
		try {
			a.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		b.mkdir();
		
		System.out.println(a.exists());			//존재유무
		System.out.println(a.isFile());			//있다면 그것이 파일인지
		System.out.println(b.isDirectory());	//디렉토리로 존재하면 true
		
		File c = new File("C:\\workspace\\Test_Java\\school\\school.txt");
		System.out.println(c.isFile());
		System.out.println(c.getName());
		System.out.println(c.getParent());	//파일의 경로
		System.out.println(c.length());		//byte단위의 파일 크기
		
		File d = new File("C:\\\\workspace\\\\Test_Java\\\\school");
		String filenames[] = d.list();
		for(String name:filenames)
		{
			System.out.println(name);
		}
		File files[] = d.listFiles();
		for(File name:files)
		{
			System.out.println(name.getName());
		}
		
		//현재 위치 알아내기
		File e = new File(".");
		try {
			System.out.println(e.getCanonicalPath());	//상대경로를 절대경로로!
		}catch(IOException e1)
		{
			e1.printStackTrace();
		}
		
		//파일명 변경하기
		File f = new File("a2.txt");
		a.renameTo(f);
		
		//파일 삭제하기
		a.delete();
	}
}
