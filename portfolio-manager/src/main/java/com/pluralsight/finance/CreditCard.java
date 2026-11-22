package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void charge(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credit Balance Add to Credit card" + amount);
        } else {
            System.out.println("Invalid Credit amount.");
        }
     }
     public void pay(double amount) {
        if (amount > balance) {
            System.out.println("Your payable balance is" + balance);
        } else {
            balance -= amount;
            System.out.println("Credit amount paid of successfully.");
        }

     }
    @Override
    public double getValue() {
        return -balance;
    }
}
