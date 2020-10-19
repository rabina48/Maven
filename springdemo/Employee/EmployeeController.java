package com.rasello.springdemo.Employee;

import com.rasello.springdemo.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeServices employeeServices;

    @Autowired
    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }


    @GetMapping(value = "/employee")
    public Employee getBookInfo() {

        Employee employee = employeeServices.getData();


        return employee;

    }
}
