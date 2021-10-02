package com.juneyoungkim.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount june = new BankAccount(1000, 1000);
		//june.displayTotal();
		june.deposit("saving", 1000);
		june.deposit("checking", 2000);
		june.withdraw("saving", 300);
		june.displayTotal();
	}

}
