package com.piyush.springboot_datajpa_jpa_hibernate.controller;

import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import com.piyush.springboot_datajpa_jpa_hibernate.service.hibernate.HibernateEmployeeService;
import com.piyush.springboot_datajpa_jpa_hibernate.service.jdbc.JDBCEmployeeService;
import com.piyush.springboot_datajpa_jpa_hibernate.service.jpa.JPAEmployeeService;
import com.piyush.springboot_datajpa_jpa_hibernate.service.springboot.SpringBootEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private JDBCEmployeeService jdbcEmployeeService;

    @Autowired
    private HibernateEmployeeService hibernateEmployeeService;

    @Autowired
    private JPAEmployeeService jpaEmployeeService;

    @Autowired
    private SpringBootEmployeeService springBootEmployeeService;

    @GetMapping("/jdbc")
    public Employee getEmployeeViaJDBC(@RequestParam String name, @RequestParam String department){
        return jdbcEmployeeService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/hibernate")
    public Employee getEmployeeViaHibernate(@RequestParam String name, @RequestParam String department){
        return hibernateEmployeeService.findByNameAndDepartment(name, department);

    }

    @GetMapping("/jpa")
    public Employee getEmployeeViaJPA(@RequestParam String name, @RequestParam String department){
        return jpaEmployeeService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/springboot")
    public Employee getEmployeeViaSpringBoot(@RequestParam String name, @RequestParam String department){
        return springBootEmployeeService.findByNameAndDepartment(name, department);
    }
}
