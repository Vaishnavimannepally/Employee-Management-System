package com.employee.crud.service;





import com.employee.crud.entity.Employee;

import com.employee.crud.repository.Employeerepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;







import java.util.List;

import java.util.Objects;

import java.util.Optional;





@Service

public class Employeeserviceimple implements Employeeservice{

	@Autowired

	private Employeerepository employeeRepository;

	@Override

	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);

		}

	@Override

	public List<Employee> fetchAllEmployees(){

		List<Employee> allEmployees = employeeRepository.findAll();

		return allEmployees;

	}

	@Override

	public Employee getEmployeeById(Long id) {

		Optional<Employee> employee = employeeRepository.findById(id);

		if(employee.isPresent()) {

			return employee.get();

		}else {

			return null;

		}

	}

	@Override

	public Employee updateEmployeeById(Long id, Employee employee) {

		Optional<Employee> employee1 = employeeRepository.findById(id);
		System.out.println(id);
		if(employee1.isPresent()) {

			Employee originalEmployee=employee1.get();

			if(Objects.nonNull(employee.getname()) && !"".equalsIgnoreCase(employee.getname())){
				System.out.println(1);

				originalEmployee .setname(employee.getname()); 

			}

			if(Objects.nonNull(employee.getdoj()) && employee.getdoj()!=""){
				System.out.println(2);

				originalEmployee .setdoj(employee.getdoj()); 

			}

			if(Objects.nonNull(employee.getsalary()) && (employee.getsalary()!=0)){
				System.out.println(4);

				originalEmployee .setsalary(employee.getsalary()); 

			}

			if(Objects.nonNull(employee.getstatus()) && (employee.getstatus()!=-1)){
				System.out.println(5);

				originalEmployee .setstatus(employee.getstatus()); 

			}
			return employeeRepository.save(originalEmployee);



		}

		return null;

	}

	@Override

	public String deleteEmployeeById(Long id) {

		if(employeeRepository.findById(id).isPresent()) {

			employeeRepository.deleteById(id);

			return "Employee deleted successfully";

		}

		return "employee by this id doesnt exists";

	}

	 

	 

	}