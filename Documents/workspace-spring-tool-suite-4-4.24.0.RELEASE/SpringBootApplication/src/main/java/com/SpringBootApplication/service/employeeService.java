package com.SpringBootApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringBootApplication.model.Employee;
import com.SpringBootApplication.repositary.employeeRepositary;
@Service
public class employeeService {
	@Autowired
	private employeeRepositary employeeRepo;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public List<Employee> getAllInfo(){
		return employeeRepo.findAll();
	}
	
	
	public Employee getByID(long id) {
		return employeeRepo.findById(id).get();
	}
	
	public void deleteById(long id) {
		employeeRepo.deleteById(id);
	}
	
	public Employee saveData(Employee employee) {
	 	return employeeRepo.save(employee);
	}
	 
	public Employee update( Employee employee) {
		return employeeRepo.save(employee);
	}


}
