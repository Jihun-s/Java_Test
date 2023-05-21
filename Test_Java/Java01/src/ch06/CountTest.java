package ch06;

class Count{
	public int serialNumber;
	public static int counter = 0;
	public int nonStaticNumber;
	
	public Count() {
		//클래스 변수는 모든 객체에 의해서 공유된다.
		counter++;
		serialNumber = counter;
		//멤버 변수는 객체 생성시 마다 초기화 된다.
		nonStaticNumber++;
	}
}
public class CountTest {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count.counter++; //static변수라서 클래스.클래스변수명(static) 으로 호출이 가능함
		Count c3 = new Count();
		System.out.println("c1 serialNumber="+c1.serialNumber);
		System.out.println("c2 serialNumber="+c2.serialNumber);
		System.out.println("c3 serialNumber="+c3.serialNumber);
		System.out.println("c1 nonStaticNumber="+c3.nonStaticNumber);
	}

}
