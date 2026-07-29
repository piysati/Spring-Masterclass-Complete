package com.piyush.springboot_datajpa_jpa_hibernate.repository.jdbc;

import com.piyush.springboot_datajpa_jpa_hibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JDBCEmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Employee findByNameAndDepartment(String name, String department){
        String sql = "SELECT * FROM employee WHERE name = ? AND department = ?";
        return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper() ,name, department);
    }
}

class EmployeeRowMapper implements RowMapper<Employee>{

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setId(rs.getLong("id"));
        emp.setName(rs.getString("name"));
        emp.setDepartment(rs.getString("department"));

        return emp;
    }
}
