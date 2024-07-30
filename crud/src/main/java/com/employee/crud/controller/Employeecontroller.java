package com.employee.crud.controller;

import com.employee.crud.entity.Employee;
import com.employee.crud.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="http://localhost:8082")
@RestController
public class Employeecontroller {
	
	
	@Autowired
	private Employeeservice employeeservice;
	
	
	
	@PostMapping("/api/employee")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeservice.saveEmployee(employee);
		
	}
	@GetMapping("/api/employee")
	public List<Employee> getAllEmployees(){
		return employeeservice.fetchAllEmployees();
	}
	@GetMapping("/api/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long id) {
		return employeeservice.getEmployeeById(id);
	}
	@PutMapping("/api/employee/{id}")
	public Employee updateEmployeeById(@PathVariable("id") Long id,@RequestBody Employee employee) {
		return employeeservice.updateEmployeeById(id, employee);
	}
	@DeleteMapping("/api/employee/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long id) {
		return employeeservice.deleteEmployeeById(id);
	}
	
	
	

}