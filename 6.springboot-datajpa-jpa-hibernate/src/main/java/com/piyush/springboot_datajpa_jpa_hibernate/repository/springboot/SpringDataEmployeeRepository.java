package com.piyush.springboot_datajpa_jpa_hibernate.repository.springboot;

import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpringDataEmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByNameAndDepartment(String name, String department);
}
