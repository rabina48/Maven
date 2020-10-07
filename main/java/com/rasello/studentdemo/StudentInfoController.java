package com.rasello.studentdemo;

import com.rasello.springdemo.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentInfoController {

    @RequestMapping  (value = "/studentdata", method = RequestMethod.GET)
    protected StudentData getResponseData() {

       StudentData data = new StudentData();
        data.setName("Rabina");
        data.setAddress("Bhaktapur");
        data.setId("oo1");
        data.setMark(80.5);
        return data;
    }

    @PostMapping("/student/add")
    public Response<StudentData> createStudent(@RequestBody StudentData data){
        return new Response<>(true, "Student  added", data);
    }




}
