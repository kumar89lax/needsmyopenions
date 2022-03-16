package com.need.my.openion.NeedsMyOpenion.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "employee")

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private String empId;
	
	private String empName;
	
	private Integer age;
	
	
	
	private String department;
	
	private String location;
	
	private Double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String empName, Integer age, String department, String location,
			Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		
		this.department = department;
		this.location = location;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", department=" + department
				+ ", location=" + location + ", salary=" + salary + "]";
	}
	
	
}
