package com.spring.demo17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resource/springDemo17.xml");
		//EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");
		
		//Employee employee01 = new Employee();
		//employee01.setEmpName("Julius");
		//employeeService.setEmployee(employee01);
		
		//String getEmpNameRes = employeeService.getEmployee().getEmpName();
		//System.out.println(getEmpNameRes);
		
		Employee employee = (Employee) ctx.getBean("employee");
		//String result = employee.getEmpName();
		//System.out.println("JoinPoint method return value is: " + result);
		employee.setEmpId("Robell");
		ctx.close();
	}
}
