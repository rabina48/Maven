package com.rasello.springdemo.BankServices;


import com.rasello.db.config.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerDbController {


    private CustomersRepository customersRepository;


    @GetMapping(value = "/customer")
    public List<CustomersInfo> getDataAll() {
      return  customersRepository.getAllData();
    }

    @GetMapping(value = "/customer/{checkid}")
    public CustomersInfo getDataById(@PathVariable long checkid) {
        return  customersRepository.getById(checkid);
    }

    @DeleteMapping(value ="/customer/{checkid}")
    public void DeleteDataById(@PathVariable("checkid") Long checkid){
         customersRepository.delete(checkid);
    }


}

