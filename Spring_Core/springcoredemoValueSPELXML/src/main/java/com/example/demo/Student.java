package com.example.demo;

public class Student {
    private String name;
    private String id;
    private Hostel hostel;
    private String currentCity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Hostel getHostel() {
        return hostel;
    }
    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }
    public String getCurrentCity() {
        return currentCity;
    }
    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }
}
