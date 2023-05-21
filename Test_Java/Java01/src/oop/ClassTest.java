package oop;

public class ClassTest {
}

class A{	//public, abstract, final
	public static final double X = 0.5;
	class D{
		//내부클래스  public, private, static
	}
}
class B{
	
}

abstract class C extends A{
	private B ob;	//public, protected, private, final, static
	
	void test() {	//public, protected, private, final, static, abstract	
	}
	abstract void test2();	//이 경우 C도 반드시 abstract
}
class E extends C{
	public void test2() {
		//반드시 test2()를 오버라이딩 해야함.
		//Or abstract class E
	}
}