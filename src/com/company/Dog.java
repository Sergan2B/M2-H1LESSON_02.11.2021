package com.company;

import java.util.Arrays;

public class Dog extends Pet{
    private String name, breed;
    private String[] commands;

    public Dog(String name, String breed, Color enumColor, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColor(enumColor);
    }



    public Dog(String name, String breed, String[] commands, Color enumColor, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColor(enumColor);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    void makeVoice(){
        System.out.println("Не издает звуков");
    }

    void makeVoice(String voice) {
        System.out.println(voice);
    }

    void makeVoice(String voice, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }

    @Override
    public String getInfo() {
        if (commands == null) return super.getInfo() + "\nName: " + name + "\nBreed: " + breed;
        else return super.getInfo() + "\nName: " + name + "\nBreed: " + breed + "\nCommands: " + Arrays.toString(commands);
    }
}
