package com.SpringBootApplication.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootApplication.model.Employee;

@Repository
public interface employeeRepositary extends JpaRepository<Employee,Long > {

}
