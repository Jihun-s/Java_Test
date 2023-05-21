package oop;

public class TestB extends TestA {
	double dnum;
	
	public TestB() {
		super(); 	//상위클래스의 기본생성자 호출
					//생략하면 기본생성자. 그 외에는 명시적 호출
					//하위클래스의 생성자의 첫 줄에서만 호출 가능
		System.out.println("TestB의 TestB()");
	}
	
	public TestB(int n, double d) {
		num = n;
		dnum = d;
		System.out.println("TestB의 TestB(int, double)");
	}
}
