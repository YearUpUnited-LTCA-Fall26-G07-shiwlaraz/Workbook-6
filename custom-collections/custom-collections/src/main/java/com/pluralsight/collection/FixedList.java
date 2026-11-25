package com.pluralsight.collection;

import java.util.ArrayList;

public class FixedList<T> {

    private int maxSize;
    private ArrayList<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {

            throw new IllegalStateException("List is full!");
        }
    }

    public ArrayList<T> getItems() {
        return new ArrayList<>(items);
    }
}
