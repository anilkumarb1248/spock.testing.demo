package com.spock.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spock.demo.service.EmployeeService;

@SpringBootApplication
public class SpockDemoApplication implements CommandLineRunner {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpockDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeService.addDummyData();
	}

}
