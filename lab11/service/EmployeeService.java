package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public List<Employee> allEmployees();
	public String addEmployee(Employee e);
	public void setScheme(String id);
	public String getScheme(String id);
}
