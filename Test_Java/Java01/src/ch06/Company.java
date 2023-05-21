package ch06;

//singleton pattern이 적용된 클래스
public class Company {
	//2. 자기 자신의 객체를 멤버로 static하게 생성한다.
	private static Company c = new Company();
	private int total;
	
	//1. 외부에서 객체를 생성하지 못하도록 접근지정자를 private 한다.
	private Company(){
		System.out.println("Company 객체 생성");
	}
	//3. 외부에서 해당 클래스의 객체를 가져다 쓸 수 있는 getter 생성
	public static Company getCompany() {
		return c;
	}
	
	public void addTotal(int total) {
		this.total += total;
	}
	public int getTotal() {
		return total;
	}
}
