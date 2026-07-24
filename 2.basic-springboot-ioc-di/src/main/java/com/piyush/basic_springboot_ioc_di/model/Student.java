package com.piyush.basic_springboot_ioc_di.model;

import com.piyush.basic_springboot_ioc_di.controller.StudentController;
import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(){
        System.out.println("Student Model object created at: " + this.hashCode());
    }

}
