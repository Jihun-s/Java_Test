package ch06.bank;

public class AccountTest {
	//상수 = public static final
	public static final String BANK_NO = "123";
	public static final String AREA_NO = "0235";

	public static void main(String[] args) {
		Account a1 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "홍길동", 500);
		deposit(a1, 1234);
		Account a2 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "김지훈", 300);
		transfer(a1, a2, 1500);//성공
		transfer(a1, a2, 2000);//실패
	}

	public static void deposit(Account a, long amount) {
		a.deposit(amount);
		System.out.println("==========[입금]==========");
		System.out.printf("%s 계좌에 %d원이 입금 되었습니다.\n", a.getAccNo(), amount);
		System.out.printf("현재 잔고 : %d원\n", a.getBalance());
		System.out.println("=========================");
	}
	
	public static void transfer(Account from, Account to, long amount) {
		if(from.transfer(amount, to)) {
		System.out.println("==========[이체]==========");
		System.out.printf("%s 계좌에서 %s계좌로 %d원이 이체 되었습니다.\n", from.getCustomer(), to.getCustomer(), amount);
		System.out.printf("현재 잔고 : %d원\n", from.getBalance());
		System.out.println("=========================");
		}else {
			System.out.println("==========[이체]==========");
			System.out.println("잔고가 부족합니다");
			System.out.printf("현재 잔고 : %d원\n", from.getBalance());
		}
	}
}
