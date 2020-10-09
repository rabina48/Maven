package com.rasello.springdemo.BankServices;

public interface BankServices {

    public abstract void createLoan(BankInfo bankLoan);
    public abstract void updateLoan(String id, BankInfo bankLoan);
    public abstract void deleteLoan(String id);

}
