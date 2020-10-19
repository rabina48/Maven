package com.rasello.springdemo.Employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class CustomerController {

    @RequestMapping(value = "/custom", method = RequestMethod.GET)
    public ModelAndView getCustomers(Customer customer) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj ", customer);
        mv.setViewName("book");
        return mv;

    }


}
