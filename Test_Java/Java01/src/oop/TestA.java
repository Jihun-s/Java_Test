package oop;

public class TestA {
	//멤버 변수
	int num;
	
	public TestA() {
		System.out.println("TestA의 TestA()");
	}
	
	public TestA(int n) {
		num = n;
		System.out.println("TestA의 TestA(int)");
	}
	
	//메소드
	public void test() {
		System.out.println("A클래스의 test() 메소드");
	}
	
}
