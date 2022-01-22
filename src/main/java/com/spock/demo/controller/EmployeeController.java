package com.spock.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spock.demo.model.Employee;
import com.spock.demo.util.ResponseStatus;


@RequestMapping("/employee")
public interface EmployeeController {

	@GetMapping({ "/list", "/all", "/employees" })
	public List<Employee> getEmployeeList();

	@GetMapping("/getById/{id}")
	public Employee getEmployee(@PathVariable(value = "id") int employeeId);
	
	@GetMapping("/getByName")
	public Employee getEmployeeByName(@RequestParam String name);

	@PostMapping("/add")
	public ResponseStatus addEmployee(@RequestBody Employee employee);

	@PutMapping("/update")
	public ResponseStatus updateEmployee(@RequestBody Employee employee);

	@DeleteMapping("/delete/{id}")
	public ResponseStatus deleteEmployee(@PathVariable(value = "id") int employeeId);

	@DeleteMapping("/deleteAll")
	public ResponseStatus deleteAll();
}
