package com.spring.service;

import com.spring.model.Employee;
import org.springframework.stereotype.Component;

//@Component
public class EmployeeService {
	
	private Employee employee;

	public Employee getEmployee() {
		System.out.println(this.getClass().toString() + " - getEmployee");
		return employee;
	}

	public void setEmployee(Employee employee) {
		System.out.println(this.getClass().toString() + " - setEmployee - " + employee.toString());
		this.employee = employee;
	}	
}
