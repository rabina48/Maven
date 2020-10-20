package com.rasello.springdemo.BankServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankServices {


    private final CustomersRepositoryImpl repository;

    @Autowired
    public BankServiceImpl(CustomersRepositoryImpl repository) {
        this.repository = repository;
    }
    @Override
    public CustomersInfo getLoan(long checkId) {

        return repository.getById(checkId);
    }
    @Override
    public List<CustomersInfo> getAll() {

        return repository.getAllData();
    }
    @Override
    public void createLoan(CustomersInfo customersInfo) {
        repository.add(customersInfo);
    }
    @Override
    public void updateLoan(CustomersInfo customersInfo) {
        repository.update(customersInfo);
    }
    @Override
    public void deleteLoan(long id) {
        repository.delete(id);

    }
}
