package com.chetankrishna.mybatis.interfaces;

import com.chetankrishna.mybatis.model.Employee;

public interface EmployeeService {

	public Employee getEmployeeById(Integer employeeId);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(Integer employeeId);
}
