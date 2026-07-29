package com.piyush.springboot_datajpa_jpa_hibernate.repository.jpa;

import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class JPAEmployeeRepository {

    @PersistenceContext
    private EntityManager em;

    public Employee findByNameAndDepartment(String name, String department) {
        String jpql = "FROM Employee WHERE name = :name AND department = :department";
        return em.createQuery(jpql, Employee.class)
                .setParameter("name", name)
                .setParameter("department", department)
                .getSingleResult();
    }
}