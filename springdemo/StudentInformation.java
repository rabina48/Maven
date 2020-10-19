package com.rasello.springdemo;


public class StudentInformation {

    private String name;
    private String address;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void show() {
        System.out.println("Hello Students!");

    }
}

