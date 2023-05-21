package api;
//키보드로부터 문자열을 입력받아 출력. 거꾸로 다시 출력.
//abc -> cba
import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//객체생성 in = 멤버변수
		System.out.print("문자열 입력: ");
		String s = sc.next();
		System.out.print("변환 출력: ");
		for(int i = s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}System.out.println();
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		String a = new String();
		StringBuffer b = new StringBuffer();
		
		a = a + "a";
		a = a.concat("b");
		System.out.println(a);
		
		b.append("a");
		b.append(1);
		System.out.println(b.toString());
	}

}
