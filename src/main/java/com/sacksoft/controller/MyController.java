package com.sacksoft.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacksoft.entity.Employee;
import com.sacksoft.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
     EmployeeService employeeService;
	
	@GetMapping("/Employees")
	List<Employee> getAll()
	{
		return this.employeeService.getAll();
	}
	@GetMapping("Employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable String id)
	{
		return this.employeeService.getEmployee(Integer.parseInt(id));
	}
	
	
	@PostMapping("/Employees")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
		
	}
	
	@PutMapping("/Employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.updateEmployee(employee);
		
	}
	
	@DeleteMapping("/Employees/{id}")
	public void deleteData(@PathVariable("id")int id)
	{
		employeeService.DeleteData(id);
		
	}

}
