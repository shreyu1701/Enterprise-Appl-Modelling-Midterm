package com.sk.week7.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "savings")
public  class Savings implements Account {
	private String accountHolder;
	private double balance;
	private double interestRate;

    
    // Methods from Account interface
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdrawal(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        }
    }

    @Override
    public void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void depositMonthlyInterest() {
        this.balance += this.balance * (interestRate / 100.0);
    }

	@Override
	public String getAccountHolder() {
		return this.accountHolder = accountHolder;
	}

	@Override
	public double getBalance() {
		return this.balance= balance;
	}
}
