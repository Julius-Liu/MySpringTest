package com.spring.service;

import com.spring.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}	
}
