package com.sacksoft.service;

import java.util.List;
import java.util.Optional;

import com.sacksoft.entity.Employee;

public interface EmployeeService {

	List<Employee> getAll();
	
	Optional<Employee> getEmployee(int id);

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void DeleteData(int id);

}
