package com.rasello.studentdemo;

import com.rasello.springdemo.SpringDemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

    }
}
