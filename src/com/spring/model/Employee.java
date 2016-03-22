package com.spring.model;

import org.springframework.stereotype.Component;

//@Component
public class Employee {
	
	private String empId;
	private String empName;
	
	public String getEmpId() {
		System.out.println(this.getClass().toString() + " - getEmpId");
		return empId;
	}
	public void setEmpId(String empId) {
		System.out.println(this.getClass().toString() + " - setEmpId - " + empId);
		this.empId = empId;
	}
	public String getEmpName() {
		System.out.println(this.getClass().toString() + " - getEmpName");
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println(this.getClass().toString() + " - setEmpName - " + empName);
		this.empName = empName;
	}
}
