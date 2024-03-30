package com.example.formula1.model;

public class Driver {
    private int id;
    private String fullname;
    private int driver_number;

    public Driver(int id, String fullname, int driver_number) {
        this.id = id;
        this.fullname = fullname;
        this.driver_number = driver_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getDriver_number() {
        return driver_number;
    }

    public void setDriver_number(int driver_number) {
        this.driver_number = driver_number;
    }
}
