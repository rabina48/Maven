package com.rasello.springdemo.services;

import com.rasello.springdemo.Employee.Employee;
import com.rasello.springdemo.Employee.Work;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeServices {

    public Employee getData() {

        Employee employee = new Employee();
        employee.setName("rabina");
        employee.setAddress("bht");
        employee.setSalary(100000);


        List<Work> workList = new ArrayList<>();
        Work work = new Work();

        work.setType("Sunday");
        work.setPost("Developement");

        Work work2 = new Work();

        work2.setType("Monday");
        work2.setPost("Design");

        Work work3 = new Work();

        work3.setType("Tuesday");
        work3.setPost("test");

        workList.add(work);
        workList.add(work2);
        workList.add(work3);

        employee.works = workList;


        return employee;

    }
}
