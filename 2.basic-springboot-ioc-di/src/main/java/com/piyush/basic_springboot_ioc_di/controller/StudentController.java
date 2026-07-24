package com.piyush.basic_springboot_ioc_di.controller;

import com.piyush.basic_springboot_ioc_di.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    public StudentController(){
        System.out.println("Student Controller object created at: " + this.hashCode());
    }

    //to get student object from service
    @GetMapping("/students")
    public int getStudentAddress(){
        return service.getStudent().hashCode();
    }
}
