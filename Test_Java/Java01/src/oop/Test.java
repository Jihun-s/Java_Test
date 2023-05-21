package oop;

public class Test {

	public static void main(String[] args) {
		TestA a = new TestA();
		TestA a2 = new TestA(100);
		int i=10;
		a.num =1;
		a.test();
		
		TestB b1 = new TestB();
		TestB b2 = new TestB(10, 2.34);
		b2.test();
		System.out.println(b2.toString());
		
		TestC c= new TestC();
		c.setBounds(100,100,300,300);
		c.setTitle("내가 만든 창");
		c.setVisible(true);
	}

}
