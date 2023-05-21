package ch07;

import ch06.bank.Account;

public class AccountArray {

	public static void main(String[] args) {
		Account a[] = new Account[3];
		a[0] = new Account("11-11", "홍길동", 500);
		a[0].printAccInfo();
	}

}
