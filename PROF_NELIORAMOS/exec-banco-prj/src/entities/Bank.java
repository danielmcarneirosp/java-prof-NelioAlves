package entities;

public class Bank {
	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Bank() {
		
	}
	
	
	public Bank(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}


	public Bank(int accountNumber, String accountHolder, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	
	public void deposit(double value) {
		this.accountBalance += value;
	}
	
	public void sake(double value) {
		this.accountBalance -= value + 5.0;
	}
	
	public void showBalance() {
		System.out.println("\nUpdate data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",getAccountNumber(),getAccountHolder(),getAccountBalance());
	}
	
	
	
	

}
