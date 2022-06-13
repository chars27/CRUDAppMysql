package com.cmm.sbcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmm.sbcrud.model.Employee;
import com.cmm.sbcrud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmp")
	public Employee saveEmp(@RequestBody Employee employee) {
		
		return employeeService.saveEmp(employee);
	}
}
