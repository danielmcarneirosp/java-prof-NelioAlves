package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimite;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimite) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimite = withdrawLimite;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimite() {
	return withdrawLimite;
	}

	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if (amount > this.withdrawLimite) {
			throw new DomainException("Exceeds withdraw limit!");
		}
		if (amount > this.balance) {
			throw new DomainException("Not enough balance!");
		}
		this.balance -= amount;
	}
	
	
	

}
