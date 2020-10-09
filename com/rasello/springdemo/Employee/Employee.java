package com.rasello.springdemo.Employee;

import java.util.List;

public class Employee {
    private  String name;
    private  String address;
    private  float salary;
    public List<Work> works;

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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public List<Work> getWorksList() {
        return works;
    }

    public void setWorksList(List<Work> works) {
        this.works = works;
    }
}
