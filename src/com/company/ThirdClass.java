package com.company;

import java.util.Arrays;

public class ThirdClass extends SecondClass{
    private String species;
    private String[] words;


    public ThirdClass(String country, String region, String city, String name, ForthClass forthClassColor, String species) {
        super(country, region, city, name, forthClassColor);
        this.species = species;
    }
    public ThirdClass(String country, String region, String city, ForthClass forthClassColor, String species, String[] words) {
        super(country, region, city, forthClassColor);
        this.species = species;
        this.words = words;
    }

    public String getSpecies() {
        return species;
    }

    public String[] getWords() {
        return words;
    }

    @Override
    public String getInfo() {
        if (words == null) return super.getInfo() + "\nвид: " + getSpecies();
        if (getName() == null) return  super.getInfo() + "\nИмя отсутствует";
        else return super.getInfo() + "\nВид: " + getSpecies() + "\nФразы: " + Arrays.toString(words);
    }
}
