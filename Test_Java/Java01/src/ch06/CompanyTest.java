package ch06;

public class CompanyTest {

	public static void main(String[] args) {
		Company c1 = Company.getCompany();
		c1.addTotal(100);
		System.out.printf("현재 Total 값:%d\n",c1.getTotal());
		Company c2 = Company.getCompany();
		c2.addTotal(200);
		System.out.printf("현재 Total 값:%d", c2.getTotal());
		//"Company 객체 생성"이 한 번만 생성됨.
	}

}
