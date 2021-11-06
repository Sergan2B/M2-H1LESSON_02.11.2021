package com.company;
//Ореал обитания
public class FirstClass {
    private String country;
    private String region;
    private String city;

    public FirstClass(String country, String region, String city) {
        this.country = country;
        this.region = region;
        this.city = city;
    }

    public FirstClass() {
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }
    public String getInfo() {
        return "\nСтрана: "+ getCountry() + "\nРегион: " +getRegion()+ "\nГород: " + getCity();
    }
}
