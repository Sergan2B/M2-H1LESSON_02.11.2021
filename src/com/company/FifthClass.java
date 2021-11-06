package com.company;
//магазин
public class FifthClass {

    private String name;
    private String address;
    private int cost;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCost() {
        return cost;
    }
    public FifthClass(String name, String address, int cost) {
        this.name = name;
        this.address = address;
        this.cost = cost;
    }
}
