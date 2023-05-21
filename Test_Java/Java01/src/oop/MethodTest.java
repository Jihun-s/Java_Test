package oop;

public class MethodTest {

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(10, 20);
		System.out.println(d1);
		System.out.println(d2);
		
		d2.print();
		System.out.println(d2.sum());	//30
		System.out.println(d1.sum());
		System.out.println(Data.sum(5,10));
		System.out.println(Data.power(2,3));//2의3승
		System.out.println(Data.sum(1, 10, 2));//1에서 10까지 2씩 증가하면서 합계
	}

}
