package com.cg.eis.main;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService eservice =new EmployeeServiceImpl();
		Employee emp1=new Employee("A1001","Ar",22000);
		Employee emp2=new Employee("A1002","Arpit",2700);
		Employee emp3=new Employee("A1006","Arpit",200001);
		
		eservice.addEmployee(emp1);
		eservice.addEmployee(emp2);
		eservice.addEmployee(emp3);
		eservice.setScheme("A1002");
		eservice.setScheme("A1006");
		
		System.out.println(eservice.getScheme("A1002"));
		System.out.println(eservice.getScheme("A1006"));
		
		//eservice.getScheme("A1002");
		
	}

}
