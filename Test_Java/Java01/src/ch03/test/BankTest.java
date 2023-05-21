package ch03.test;

public class BankTest {

	public static void main(String[] args) {
		Account a1 = new Account("11-11", "홍길동", 500);
		//실행하는 순간 heap에 올라가고, a1에 주소값을 할당.
		a1.printAccountInfo();
		System.out.println("a1 계좌에 300 입금");
		a1.deposit(300);
		System.out.println("계좌 정보: ");
		a1.printAccountInfo();
	}

}
