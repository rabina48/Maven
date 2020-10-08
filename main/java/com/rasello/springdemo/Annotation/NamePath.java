package com.rasello.springdemo.Annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class NamePath {

    @RequestMapping(value = "/user/{username}",method = RequestMethod.GET)
    public String getData(@PathVariable("username") String name){

        ModelAndView mv = new ModelAndView("Hello Pages");

        mv.addObject("Hello "+name);
        return "Hello "+name;
    }

}
