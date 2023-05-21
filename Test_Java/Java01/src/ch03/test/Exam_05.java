package ch03.test;

public class Exam_05 {

	public static void main(String[] args) {
		int x =100; int y =200; int e;
		System.out.printf("교환 전: x=%d, y=%d\n", x, y);
		e=y; y=x; x=e; //x,y값 교환
		System.out.printf("교환 후: x=%d, y=%d", x, y);
	}

}
