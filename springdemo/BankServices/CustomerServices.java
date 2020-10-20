package com.rasello.springdemo.BankServices;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices implements CustomersRepository{

    private  CustomerDbRepo customerDbRepo;

    @Override
    public void add(CustomersInfo customersInfo) {
        customerDbRepo.add(customersInfo);

    }

    @Override
    public void update(CustomersInfo customersInfo) {
        customerDbRepo.add(customersInfo);

    }

    @Override
    public void delete(long checkId) {
        customerDbRepo.delete(checkId);

    }

    @Override
    public CustomersInfo getById(long checkId) {

        return customerDbRepo.getById(checkId);
    }

    @Override
    public List<CustomersInfo> getAllData() {

        return customerDbRepo.getAllData();
    }
}
