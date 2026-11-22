package com.pluralsight.finance;

import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));

        account1.deposit(100);
     //   account2.deposit(100);


        System.out.print("Bank Balance " + account1.getValue());
    }
}
