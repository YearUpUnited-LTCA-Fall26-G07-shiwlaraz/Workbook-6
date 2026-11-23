package com.pluralsight.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FixedList<String> names = new FixedList<>(2);

        names.add("das");
        names.add("pial");
        names.add("newName");

        System.out.print(names.getItems());
        System.out.println("\n" +names.getItems().size());

        FixedList<Integer> dollarBills = new FixedList<>(5);
        dollarBills.add(1);
        dollarBills.add(5);
        dollarBills.add(10);
        dollarBills.add(20);
        dollarBills.add(100);
        System.out.print(dollarBills.getItems());
        System.out.print("\n" + dollarBills.getItems().size());


        FixedList<LocalDateTime> localDateTime = new FixedList<>(3);
        localDateTime.add(LocalDateTime.now());
        localDateTime.add(LocalDateTime.now());
        localDateTime.add(LocalDateTime.now());
        localDateTime.add(LocalDateTime.now());
        System.out.print(localDateTime.getItems());
        System.out.print("\n" + localDateTime.getItems().size());

        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail
        System.out.print(numbers.getItems());
        System.out.println("\n" + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        System.out.print(dates.getItems());
        System.out.println("\n" + dates.getItems().size());

//        dates.add(15); // this line should fail

    }


}
