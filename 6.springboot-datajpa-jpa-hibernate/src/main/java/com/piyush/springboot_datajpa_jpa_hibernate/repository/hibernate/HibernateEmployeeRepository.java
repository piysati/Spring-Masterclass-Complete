package com.piyush.springboot_datajpa_jpa_hibernate.repository.hibernate;

import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateEmployeeRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public Employee findByNameAndDepartment(String name, String department){
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM Employee WHERE name = :name AND department = :department";
            return session.createQuery(hql, Employee.class)
                    .setParameter("name", name)
                    .setParameter("department", department)
                    .uniqueResult();
        }
    }
}
