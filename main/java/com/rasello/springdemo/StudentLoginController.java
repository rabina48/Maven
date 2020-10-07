package com.rasello.springdemo;


import org.springframework.web.bind.annotation.*;

@RestController
public class StudentLoginController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    protected StudentInformation getResponseLogin() {
        System.out.println("Welcome to HomePage!");
        StudentInformation information = new StudentInformation();
        information.setName("Rabina");
        information.setAddress("Bhaktapur");
        information.setId("oo1");
        return information;
    }

    @PostMapping("/student/add")
    public Response<StudentInformation> createStudent(@RequestBody StudentInformation information){
        return new Response<>(true, "Student information added", information);
    }
}
