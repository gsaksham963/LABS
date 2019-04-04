package com.cg.eis.pl;

import java.util.List;

import com.cg.eis.bean.Employee;


public interface EmployeeOperation {
	
	
		public List<Employee> allEmployees();
		public String addEmployee(Employee e);
		public String getScheme(String id);
		public void setScheme(String id);
}
