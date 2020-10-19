package com.rasello.springdemo.BankServices;

import java.util.List;

public interface CustomersRepository {

    void add(CustomersInfo customersInfo);

    void update(CustomersInfo customersInfo);

    void delete(long checkId);

    CustomersInfo getById(long checkId);

    List<CustomersInfo> getAllData();
}
