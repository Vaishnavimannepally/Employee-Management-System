package com.employee.crud.service;



import com.employee.crud.entity.Employee;

import java.util.List;

public interface Employeeservice {

	Employee saveEmployee(Employee employee);

	List<Employee> fetchAllEmployees();

	Employee getEmployeeById(Long id);

	Employee updateEmployeeById(Long id,Employee employee);

	String deleteEmployeeById(Long id);



}