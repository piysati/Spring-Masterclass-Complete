package com.piyush.springboot_datajpa_jpa_hibernate.service.jdbc;

import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import com.piyush.springboot_datajpa_jpa_hibernate.repository.jdbc.JDBCEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JDBCEmployeeService {

    @Autowired
    private JDBCEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department){
        return repository.findByNameAndDepartment(name,department);
    }
}
