package com.piyush.basic_springboot_restapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private List<Employee> empList = new ArrayList<>();

    @GetMapping("/message")
    public String getMessage(){
        return "This is my 1st API";
    }

    //http://localhost:8080/employees/2
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee emp = null;
        for(Employee e : empList){
            if(id == e.getId()) emp = e;
        }
        return emp;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return this.empList;
    }

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee emp){
        //db to save, but use list for now
        empList.add(emp);
    }

    //http://localhost:8080/employees?id=4
    @DeleteMapping("/employee")
    public void deleteEmployee(@RequestParam int id){
        for(Employee e : empList){
            if(id == e.getId()) empList.remove(e);
        }
    }

    @PutMapping("/employee")
    public void updateEmployee(@RequestParam int id, @RequestBody Employee employee){
        for(int i = 0; i < empList.size(); i++){
            if(id == empList.get(i).getId()) {
                empList.set(i, employee);
            }
        }

    }


}
