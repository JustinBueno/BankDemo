package BankDemo;

public class Account {

	private double balance;

	// Set balance to 0.00
	public Account() {
		balance = 0.0;
	}


	// Deposit 
	public void deposit(double amount) {
		balance = balance + amount;
	}

	// Withhdraw
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance = balnce - amount;
		}
		else {
			system.err.println("Transaction cancelled due to insufficient funds")
		}
		
		balance = balance - amount 

	}

	// Get Balance
	public double getBalance() {
		return balance;
	}

}
