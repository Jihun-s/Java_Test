package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TextTest {

	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		File tempFile = new File("임시파일.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
		FileReader in = null;
		String s = "1", d = ""; File c;
		while(s!="")
		{
			String text = "";
			s = br.readLine();
			if(s.equals(""))
			{
				System.out.println("저장하시겠습니까? (y/n)");
				while(!(text.equals("y")||text.equals("n")))
				{
					text = br.readLine();
					if(text.equals("n"))
					{
						return;
					}else if(text.equals("y"))
					{
						break;
					}else {
						System.out.println("(y/n)으로 대답해주세요.");
						continue;
					}
				}//y/n으로만 입력받는 while
				if(text.equals("y")){break;}
			}//저장? - if
			bw.write(s + "\n");
		}//저장질문 while 닫기
		bw.close();
		
		loop:
			while(true) {
				System.out.print("파일명: ");
				try {
					d = br.readLine();
					in = new FileReader(d);
				 }catch(FileNotFoundException e)
				 {
					 tempFile.renameTo(new File(d));
					 //저장
					 System.out.println("파일이 저장되었습니다.");
					 return;
				 }//중복이름 없는 파일저장
				c = new File(d);
				if(c.exists())
				{
					String b = "";
					System.out.println("이미 사용중인 이름입니다. 덮어쓰시겠습니까?(y/n)");
					while(!(b.equals("y")||b.equals("n")))
					{
						b = br.readLine();
						if(b.equals("n"))
						{
							continue loop;
						}else if(b.equals("y"))
						{
							in.close();
							new File(d).delete();
							
							tempFile.renameTo(new File(d));
							System.out.println("파일이 저장되었습니다.");
						//저장
							break loop;
						}else {
							System.out.println("(y/n)으로 대답해주세요.");
							continue;
						}
					}//덮어쓸껀지 while
				}//이미 있는 파일이면?
			}//파일로 저장 while
	}
}



//*내용을 입력하세요 (종료는 새 행에서 Enter)
//1:abcd
//2:1234
//3:가나다라
//4:
//저장하시겠습니까? (y/n) y
//파일명: a.txt
//이미 사용중인 이름입니다. 덮어쓰시겠습니까?(y/n) n
//파일명: b.txt

//b.txt 파일이 저장되었습니다.

//(String/ StringBuffer/ ArrayList/ 임시파일(Clear)) - 힌트
//close하면 flush.
