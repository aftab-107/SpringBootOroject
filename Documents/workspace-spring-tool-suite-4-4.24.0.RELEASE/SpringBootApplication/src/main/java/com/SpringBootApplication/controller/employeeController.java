package com.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootApplication.model.Employee;
import com.SpringBootApplication.service.employeeService;

@RestController
@RequestMapping("/")
public class employeeController {
	@Autowired
	private employeeService employeeSer;
	
	@GetMapping("/emp")
	
	public List<Employee> AllInfo(){
		return employeeSer.getAllInfo();
		
	}
	
	
	@GetMapping("/byid/{empid}")
	
	public Employee getById(@PathVariable("empid") long id) {
		return employeeSer.getByID(id);
	}
	
	@DeleteMapping("/byid/{empid}")
	public void deletebyid(@PathVariable("empid") long id) {
		 employeeSer.deleteById(id);
	}
	
	@PostMapping("/employee")
	
	public Employee saveEmp(@RequestBody Employee employee) {
		
		  return employeeSer.saveData(employee);
	}
	
	@PutMapping("emp")
	
	public Employee update(@RequestBody Employee employee) {
		return employeeSer.update(employee);
		
	}

}
