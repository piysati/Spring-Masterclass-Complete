package com.piyush.springboot_datajpa_jpa_hibernate.service.springboot;

import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import com.piyush.springboot_datajpa_jpa_hibernate.repository.springboot.SpringDataEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringBootEmployeeService {

    @Autowired
    private SpringDataEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department){
        return repository.findByNameAndDepartment(name,department);
    }
}
