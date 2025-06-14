package com.fruityLoops.main;

public class Item {
    private String name;
    private double price;

    // constructor, getters + setters
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
}
