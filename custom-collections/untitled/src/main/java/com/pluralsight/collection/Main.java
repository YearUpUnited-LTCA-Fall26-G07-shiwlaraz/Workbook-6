package com.pluralsight.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount();
        System.out.println(acct.getBalance());


        System.out.println(acct.balance);


        double b = acct.getBalance();

    }
}