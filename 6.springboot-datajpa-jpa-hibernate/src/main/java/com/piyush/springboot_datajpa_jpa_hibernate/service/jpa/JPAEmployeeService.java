package com.piyush.springboot_datajpa_jpa_hibernate.service.jpa;


import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import com.piyush.springboot_datajpa_jpa_hibernate.repository.jpa.JPAEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPAEmployeeService {

    @Autowired
    private JPAEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department){
        return repository.findByNameAndDepartment(name,department);
    }
}
