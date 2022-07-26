package com.rest.springbootemployee.controller;

import com.rest.springbootemployee.Repository.EmployeeRepository;
import com.rest.springbootemployee.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @GetMapping(params = {"gender"})
    public List<Employee> getEmployeeByGender(@RequestParam("gender")String gender){
        return employeeRepository.findByGender(gender);
    }

    @GetMapping(params = {"page","pageSize"})
    public List<Employee> findByPage(@RequestParam int page, @RequestParam int pageSize){
        return employeeRepository.findByPage(page,pageSize);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeRepository.insert(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee employee){
        return employeeRepository.update(id,employee);
    }

    @DeleteMapping("/{id}")
    public Employee delete(@PathVariable int id){
        return employeeRepository.delete(id);
    }
}
