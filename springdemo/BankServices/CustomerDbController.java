package com.rasello.springdemo.BankServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerDbController {


    private CustomersRepository customersRepository;


    @GetMapping(value = "/customer")
    public List<CustomersInfo> getDataAll() {
        List<CustomersInfo> value = customersRepository.getAllData();

        return  value;
    }


}

