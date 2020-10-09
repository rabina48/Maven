package com.rasello.springdemo;


import com.rasello.springdemo.Annotation.MathComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentLoginController {

    private final MathComponent mathComponent;

    @Autowired
    public StudentLoginController(MathComponent mathComponent) {
        this.mathComponent = mathComponent;
    }


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

    @GetMapping("/add/{n1}/{n2}")
    public Response<Integer> getSumResult(@PathVariable int n1, @PathVariable int n2) {
        return new Response<>(true, "Success", mathComponent.add(n1,n2));
    }
}
