package com.chetankrishna.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chetankrishna.mybatis.model.Employee;
import com.chetankrishna.mybatis.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeServiceImpl employeeServiceImpl;
	
	public EmployeeController(@Autowired EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("employeeId") Integer employeeId) {
		Employee employee = employeeServiceImpl.getEmployeeById(employeeId);
		return new ResponseEntity<Employee>(employee, null, HttpStatus.OK);
	}
}
