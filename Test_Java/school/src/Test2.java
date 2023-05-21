import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		String answer = Integer.toString(sum);
		FileWriter out = null;
		try {
			out = new FileWriter("2번답안.txt");
		}catch(IOException e)	
		{
			System.out.println("파일 생성 실패");
			return;
		}
		try {
			out.write(answer);
			out.close();
		}catch(IOException e)
		{
			System.out.println("쓰기 작업 중 오류");
		}
	}
}
