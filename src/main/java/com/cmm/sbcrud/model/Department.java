package com.cmm.sbcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Department_ID")
	private Integer departmentID;
	
	@Column(name = "Department_Name")
	private String departmentName;
	
	@Column(name = "Department_Location")
	private String departmentLocation;
	
	@OneToOne(mappedBy = "employeeDepartment")
	@JsonIgnore
	Employee employee;
	
	public Department(String departmentName, String departmentLocation) {
		super();
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}	
}
