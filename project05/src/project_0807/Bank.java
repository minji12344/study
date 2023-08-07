package project_0807;

public class Bank {
	private String accountNumber;
	private int balance;
	
	Bank(String accountNumber,int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	int getbank(){
		return balance;
	}
	
	void deposit(int amount) {
		if(amount < 0) {
			System.err.println("잘못된 입력입니다.");
			return;
		}
		this.balance += amount;
	}
	
	void withdraw(int amount) {
		if(amount< 0 || amount > balance) {
			System.err.println("잘못된 입력입니다. 잔액이 부족합니다.");
			return;

		}
		this.balance -= amount;
	}
}
