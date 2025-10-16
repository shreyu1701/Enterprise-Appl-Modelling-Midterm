package com.sk.week7.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "checking")
public  class Checking implements Account {
private String accountHolder;
private double balance;
private double insufficientFundFee;


@Override
public void deposit(double amount) {
this.balance += amount;
}


@Override
public void withdrawal(double amount) {
if (amount > balance) {
this.balance -= insufficientFundFee;
} else {
this.balance -= amount;
}
}


@Override
public void updateBalance(double newBalance) {
this.balance = newBalance;
}


@Override
public String getAccountHolder() {
	 return this.accountHolder= accountHolder;
	 
}


@Override
public double getBalance() {
	
	return this.balance = balance;
}


//public void processingCheck(Check check) {
//// Processing logic (optional stub)
//}
}