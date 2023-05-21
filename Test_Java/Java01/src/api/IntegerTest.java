package api;

public class IntegerTest {

	public static void main(String[] args) {
		int i = 100;
		String s = "123";
		
		//int -> Integer
		Integer in = new Integer(i);
		//String -> Integer
		Integer is = new Integer(s);
		
		//Integer -> int
		int i2 = in.intValue();
		//Integer -> String
		String s2 = in.toString();
		
		//int -> String
		String s3 = Integer.toString(i);
		//String -> int
		int i3 = Integer.parseInt(s);		//제일 많이 쓰임!!
		
		String s4 = Integer.toString(i, 16);	//N radix = N진수
		int i4 = Integer.parseInt("10", 2);
		System.out.println(i4);
		System.out.println("'");
	}
}
