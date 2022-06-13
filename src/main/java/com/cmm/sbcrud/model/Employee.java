package com.cmm.sbcrud.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employee_ID")
	private Integer employeeID;
	
	@Column(name = "Employee_Name")
	private String employeeName;
	
	@Column(name = "Employee_Salary")
	private String employeeSalary;
	
	@Column(name = "Employee_DOB")
	private Date employeeBirthDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Department employeeDepartment;

	public Employee(String employeeName, String employeeSalary, Date employeeBirthDate, Department employeeDepartment) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeBirthDate = employeeBirthDate;
		this.employeeDepartment = employeeDepartment;
	}
}
