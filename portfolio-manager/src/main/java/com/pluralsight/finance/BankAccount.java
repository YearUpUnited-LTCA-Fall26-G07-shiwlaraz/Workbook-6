package com.pluralsight.finance;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

public class BankAccount implements Valuable {
    private String name;
    private int AccountNumber;
    private BigDecimal balance;


    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        this.name = name;
        this.AccountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance.add(BigDecimal.valueOf(amount));
            System.out.println("Deposit successful: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 &&
                BigDecimal.valueOf(amount).compareTo(balance) <= 0) {

            balance = balance.subtract(BigDecimal.valueOf(amount));
            System.out.println("Withdrawal successful: $" + amount);

        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    @Override
    public double getValue() {
        return balance.doubleValue();
    }
}
