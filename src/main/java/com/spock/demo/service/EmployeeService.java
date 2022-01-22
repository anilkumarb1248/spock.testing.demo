package com.spock.demo.service;

import java.util.List;

import com.spock.demo.model.Employee;
import com.spock.demo.util.ResponseStatus;

public interface EmployeeService {

	public List<Employee> getEmployeeList();

	public Employee getEmployee(int employeeId);

	public ResponseStatus addEmployee(Employee employee);

	public ResponseStatus updateEmployee(Employee employee);

	public ResponseStatus deleteEmployee(int employeeId);

	public ResponseStatus deleteAll();

	public Employee getEmployeeByName(String name);
	
	public ResponseStatus addDummyData();
	
}
