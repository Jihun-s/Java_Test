package ch06.bank;

public class Account {
	private String accNo; //계좌변호
	private String customer; //고객 이름
	private long balance; //잔고
	
	public Account(String accNo, String customer, long balance) {
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(String accNo, String customer) {
		this(accNo, customer, 0);
	}//오버로딩 - balance에 디폴트 0

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAccNo() {
		return accNo;
	}

	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(long amount) {
		balance += amount;
	}
	//출금
	public boolean withdraw(long amount) {
		boolean result = false;
		if(balance>amount) {
			balance -= amount;
			return result = true;
		}
		return result;
	}
	
	//이체
	public boolean transfer(long amount, Account target) {
		boolean result = false;
		if(withdraw(amount)) {
			target.deposit(amount);
			result = true;
		}
		return result;
	}
	public void printAccInfo() {
		System.out.printf("계좌번호: %s\n계좌주: %s\n잔고: %d\n", accNo, customer, balance);
	}
}
