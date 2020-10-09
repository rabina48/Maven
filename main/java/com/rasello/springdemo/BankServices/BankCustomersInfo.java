package com.rasello.springdemo.BankServices;



public class BankCustomersInfo {

        private long checkId;
        private String name;
        private double amount;

    public long getCheckId() {
        return checkId;
    }

    public void setCheckId(long checkId) {
        checkId = checkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}


