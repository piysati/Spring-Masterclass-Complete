package com.piyush.basic_springboot_ioc_di.service;

import com.piyush.basic_springboot_ioc_di.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private Student student;

    public StudentService(){
        System.out.println("Student Service object created at: " + this.hashCode());
    }

    public Student getStudent(){
        return student;
    }

}
