package com.chetankrishna.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.chetankrishna.mybatis.model.Employee;

@Mapper
public interface EmployeeMapper {

	@Select("SELECT employee_id as employeeId, employee_name as employeeName, employee_salary as employeeSalary FROM employee"
			+ " WHERE employee_id = #{employeeId}")
	Employee selectEmployeeById(Integer employeeId);
	
	@Select("SELECT employee_id as employeeId, employee_name as employeeName, employee_salary as employeeSalary FROM employee")
    List<Employee> findAll();

    @Insert("INSERT INTO employee (employee_id, employee_name, employee_salary) VALUES (#{employeeId}, #{employeeName}, #{employeeSalary})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insertEmployee(Employee employee);
}
