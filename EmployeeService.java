package com.tejasango.demo.EmployeeManagementSystem.service;


import com.tejasango.demo.EmployeeManagementSystem.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
