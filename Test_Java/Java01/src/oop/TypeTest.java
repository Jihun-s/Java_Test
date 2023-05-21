package oop;

public class TypeTest {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		Double b = new Double(1.1);
		Number c = new Integer(2);
		Number d = new Double(2.2);
		Object e = new Integer(3);
		String f = new String("aaa");
		Object g = new String("ccc");
		
		System.out.println(a instanceof Integer);	//정확한 타입 일치
		System.out.println((Object)a instanceof Number);	//상속관계에서의 상위타입
		System.out.println(a instanceof Object);	//상위타입
		//System.out.println(a instanceof Double); 	//애초에 상속 관계가 아님
		System.out.println(c instanceof Double); 	//상속관계
		System.out.println(f instanceof Object);
		System.out.println(g instanceof String);
		System.out.println(e instanceof String); 
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Math.PI);
	}

}
