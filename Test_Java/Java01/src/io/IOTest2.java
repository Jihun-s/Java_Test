package io;

import java.io.FileWriter;
import java.io.IOException;
//텍스트 파일 쓰기
public class IOTest2 {

	public static void main(String[] args) {
		FileWriter out = null;
		
		//스트림 생성
		try {
			out = new FileWriter("b.txt");		//이 경우 같은 이름의 파일이 존재하는경우
		}catch(IOException e)					//내용이 통채로 사라지고 새로 생성됨(덮어쓰기)
		{
			System.out.println("파일 생성 실패");
			return;		//혹시라도 파일 생성 실패가 되면 이 이후의 작업은 의미가 없어짐. return;
		}
		
		//입출력 작업
		try {
			out.write("A");
			out.write("가");
			out.write("\n");
		}catch(IOException e)
		{
			System.out.println("쓰기 작업 중 오류");
		}
		
		//스트림 닫기
		try {
			out.close();
		}catch(IOException e)
		{
			System.out.println("파일 닫기 오류");
		}
	}

}
