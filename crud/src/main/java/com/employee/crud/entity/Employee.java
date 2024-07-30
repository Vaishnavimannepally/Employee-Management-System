package com.employee.crud.entity;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity

public class Employee {

	

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;

	private String name;

	private String doj;

	private int status;

	private float salary;

	

	public Employee() {}

	

	public Employee(Long id, String name, String doj, int status,float salary) {

		this.id=id;

		this.name=name;

		this.doj=doj;

		this.status=status;

		this.salary=salary;

	}

	

	public Employee(String name, String doj, int status,float salary) {

		this.name=name;

		this.doj=doj;

		this.status=status;

		this.salary=salary;

	}

	

	public Long getid() {

		return id;

	}

	

	public void setid(Long id) {

		this.id=id;

	}

	public String getname() {

		return name;

	}

	public void setname(String name) {

		this.name=name;

	}

	public String getdoj() {

		return doj;

	}

	public void setdoj(String doj) {

		this.doj=doj;

	}

	public float getsalary() {

		return salary;

	}

	public void setsalary(float salary) {

		this.salary=salary;

	}

	public int getstatus() {

		return status;

	}

	public void setstatus(int status) {

		this.status=status;

	}

}
