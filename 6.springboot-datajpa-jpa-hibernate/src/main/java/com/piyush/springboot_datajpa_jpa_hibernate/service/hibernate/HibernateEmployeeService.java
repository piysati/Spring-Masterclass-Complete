package com.piyush.springboot_datajpa_jpa_hibernate.service.hibernate;

import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import com.piyush.springboot_datajpa_jpa_hibernate.repository.hibernate.HibernateEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HibernateEmployeeService {

    @Autowired
    private HibernateEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department){
        return repository.findByNameAndDepartment(name,department);
    }
}
