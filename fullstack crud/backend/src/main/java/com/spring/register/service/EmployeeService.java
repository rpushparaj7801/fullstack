package com.spring.register.service;


import com.spring.register.entity.Employee;
import com.spring.register.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> saveEmployees(List<Employee> employees) {
    return employeeRepository.saveAll(employees);
    }
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateById(int id, Employee employee) {
        if (employeeRepository.existsById(id)){
            employee.setId(id);
            return employeeRepository.save(employee);
        }
            return employee;
    }


    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


}


