package com.n.springsecurity.p.service;

import java.util.List;

import com.n.springsecurity.p.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
