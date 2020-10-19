package com.rasello.springdemo.Annotation;

import org.springframework.stereotype.Component;


@Component
public class MathComponent {

    public int add(int n1, int n2) {
        return n1 + n2;
    }


}

