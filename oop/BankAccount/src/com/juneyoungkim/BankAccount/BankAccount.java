package com.juneyoungkim.BankAccount;

public class BankAccount {
	public double checkingBalance;
	public double savingsBalance;
	
	public static int numOfAccounts;
	public static double totalAmount;
	
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numOfAccounts++;
		totalAmount = checkingBalance + savingsBalance;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void deposit(String account, double amount) {
		if (account.toLowerCase() == "saving") {
			this.savingsBalance += amount;
			totalAmount += amount;
			System.out.println("Deposit to savings account is complete");
		}
		else if(account.toLowerCase() == "checking") {
			this.checkingBalance += amount;
			totalAmount += amount;
			System.out.println("Deposit to checking account is complete");
		}
	}
	public void withdraw(String account, double amount) {
		if (account.toLowerCase() == "saving" && this.savingsBalance >= amount) {
			this.savingsBalance -= amount;
			totalAmount -= amount;
			System.out.println("Withdraw from savings account is complete");
		}
		else if(account.toLowerCase() == "checking" && this.checkingBalance >= amount) {
			this.checkingBalance -= amount;
			totalAmount -= amount;
			System.out.println("Withdraw from checking account is complete");
		}
		else {
			System.out.println("Insufficient funds available");
		}
	}
	public void displayTotal() {
		System.out.println("Total Amount: " + totalAmount);
	}
}
