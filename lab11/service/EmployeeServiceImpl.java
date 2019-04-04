package com.cg.eis.service;

import java.util.List;

import com.cg.eis.pl.EmployeeOperation;
import com.cg.eis.pl.EmployeeOperationImpl;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeOperation eo=new EmployeeOperationImpl();
	@Override
	public List<Employee> allEmployees() {
		// TODO Auto-generated method stub
		return eo.allEmployees();
	}
	
	@Override
	public String addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return eo.addEmployee(e);
	}

	

	@Override
	public void setScheme(String id) {
		// TODO Auto-generated method stub
		eo.setScheme(id);
	}

	@Override
	public String getScheme(String id) {
		return eo.getScheme(id);
	}

	
}
