package com.rasello.springdemo.BankServices;

import java.util.List;

public interface BankServices {

    CustomersInfo getLoan(long checkId);

    List<CustomersInfo> getAll();

    void createLoan(CustomersInfo customersInfo);

    void updateLoan(CustomersInfo customersInfo);

    void deleteLoan(long id);

}
