package api;

//java.lang.String 테스트
public class StringTest1 {
	public static void main(String[] args) {
		String a;
		String b = null;
		String c = "";
		String d = "abc";
		String e = "abc";
		String f = new String("abc");
		String g = new String("abc");
		
		//System.out.println(a);	초기화 되지 않은 상태.
		System.out.println(b);					//값은 없지만 초기화 되지 않은 것과는 다름. - 객체는 없음.
		System.out.println(c);					//객체는 있지만 내용이 0글자.
		System.out.println(d);					//new가 없는 경우 String객체 생성 X, 생성된"abc" 주솟값 참조만 함.
		System.out.println(e);					//위와 같은 주소값이 같음. 같은 "abc" 공유
		System.out.println("====줄====");
		System.out.println(d == e);
		
		System.out.println(f);					//heap에 String객체를 생성하고 abc생성 % 주솟값 보유
		System.out.println(g);					//heap에 또 객체 생성됨 - 주솟값도 위와 다름
		
		System.out.println(f == g); 			//같은 객체(주소값)인 지를 묻는 것.
		System.out.println(f.equals(g));		//내용비교
		System.out.println(f.equals("ABC"));
		System.out.println(f.equalsIgnoreCase("ABC"));
		System.out.println("==== 구분 ====");
		String s = "abcdefg";
		System.out.println("====내 질문====="+s.contains("abcd"));
		
		System.out.println(s.length());			//문자열의 길이
		System.out.println(s.charAt(1));		//1번째 자리 문자
		System.out.println(s.substring(1,6));	//부분 문자열 읽기(a,b) a번 문자~b번 전 문자까지 문자열
		System.out.println(s.substring(4));		//부분 문자열 읽기
		System.out.println(s.substring(2,5).length());		//부분 문자열 길이
		System.out.println(s.substring(s.length() - 1));	//마지막 문자
		System.out.println(s.indexOf('c'));		//문자의 위치
		System.out.println(s.indexOf("de"));	//
		System.out.println(s.contains("def"));
		System.out.println(s.compareTo("aba"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//특정 문자를 뒤에서부타 찾기
		System.out.println("efaaaefaaaef".lastIndexOf("ef"));
		//"abc"로 시작하는가
		System.out.println(s.startsWith("abc"));
		//"fg"로 끝나는가
		s = "a";
		s += "b";
		s += "c";
		System.out.println(s);
		s = "010-1111-2222";
		String s2 = s.replaceAll("-", "/");
		System.out.println(s2);
		String s3[] = s.split("-");
		System.out.println(s3[1]);			//0번 방 split
	}
}
