package api;
//인터페이스 = 상수와 추상메소드로 이루어진 클래스와 비슷하다.(같진 않음)
//자바는 다중상속 금지! C++은 다중상속 가능!

//인터페이스는 제대로된 클래스가 아니므로 다중상속으로 인한 문제를 일으키지 않는다는 전제.로
//인터페이스는 몇개든 상속 가능!
public interface Test {				//추상클래스 또는 인터페이스 가능
	public static final int a = 1;
	
	public abstract void method();	//추상메소드.

}
