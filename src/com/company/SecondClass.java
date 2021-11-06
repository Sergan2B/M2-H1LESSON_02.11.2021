package com.company;

import java.util.Random;

//Птицы
public class SecondClass extends FirstClass{
    private int age = generateDefaultAge();
    private String name;
    private ForthClass forthClassColor;

    public SecondClass(){}

    public SecondClass(String country, String region, String city, String name, ForthClass forthClassColor) {
        super(country, region, city);
        this.name = name;
        this.forthClassColor = forthClassColor;
    }

    public SecondClass(String country, String region, String city, ForthClass forthClassColor) {
        super (country, region, city);
        this.forthClassColor = forthClassColor;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public ForthClass getForthClassColor() {
        return forthClassColor;
    }

    public int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
    public String getInfo() {
        return super.getInfo() + "\nИмя: " + name + "\nВозраст: " + age + "\nОкрас: " + forthClassColor;
    }
}
