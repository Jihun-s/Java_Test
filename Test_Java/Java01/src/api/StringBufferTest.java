package api;

public class StringBufferTest {

	public static void main(String[] args) {
		String a = new String("abc");
		String b = new String("abc");
		StringBuffer c = new StringBuffer("abc");
		StringBuffer d = new StringBuffer("abc");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(c ==d);
	}

}
