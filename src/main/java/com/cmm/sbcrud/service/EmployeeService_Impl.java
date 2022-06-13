package com.cmm.sbcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmm.sbcrud.model.Employee;
import com.cmm.sbcrud.repository.EmployeeRespository;

@Service
public class EmployeeService_Impl implements EmployeeService {

	@Autowired
	EmployeeRespository employeeRespository;
	
	
	@Override
	public Employee saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRespository.save(employee);
	}

}
