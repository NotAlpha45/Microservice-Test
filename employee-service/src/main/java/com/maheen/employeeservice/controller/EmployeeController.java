package com.maheen.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maheen.employeeservice.entity.Employee;
import com.maheen.employeeservice.service.EmployeeService;


@RestController
// @RequestMapping("/employees")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") String employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }
}