package com.spring.demo16;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resource/springDemo16.xml");
		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");
		
		Employee employee01 = new Employee();
		employee01.setEmpName("Julius");
		employeeService.setEmployee(employee01);
		String getEmpNameRes = employeeService.getEmployee().getEmpName();
		System.out.println(getEmpNameRes);
		
		//employeeService.getEmployee().setEmpName("Julius");
	}
}
