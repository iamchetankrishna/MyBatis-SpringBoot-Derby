package com.chetankrishna.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetankrishna.mybatis.interfaces.EmployeeService;
import com.chetankrishna.mybatis.mapper.EmployeeMapper;
import com.chetankrishna.mybatis.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeMapper employeeMapper;
	
	public EmployeeServiceImpl(@Autowired EmployeeMapper employeeMapper) {
		this.employeeMapper = employeeMapper;
	}
	
	@Override
	public Employee getEmployeeById(Integer employeeId) {
		return employeeMapper.selectEmployeeById(employeeId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeMapper.insertEmployee(employee);
		return employeeMapper.selectEmployeeById(employee.getEmployeeId());
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

}
