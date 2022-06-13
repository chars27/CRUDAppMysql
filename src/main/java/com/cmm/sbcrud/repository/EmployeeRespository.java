package com.cmm.sbcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmm.sbcrud.model.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
