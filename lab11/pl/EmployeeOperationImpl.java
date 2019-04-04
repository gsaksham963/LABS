package com.cg.eis.pl;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeOperationImpl implements EmployeeOperation{

	List<Employee> li=new ArrayList<Employee>();

	@Override
	public List<Employee> allEmployees() {
		// TODO Auto-generated method stub
		return li;
	}

	@Override
	public String addEmployee(Employee e) {
		// TODO Auto-generated method stub
		li.add(e);
		return "Added Succesfully";
	}

	@Override
	public void setScheme(String id) {
		// TODO Auto-generated method stub
		for(Employee e1:li)
		{
			if(e1.getId().equals(id))
			{
				if(e1.getSalary()>=5000 && e1.getSalary()<20000)
				{
					e1.setDesignation("System Associate");
					e1.setInsuranceScheme("Scheme C");
				}
				else if(e1.getSalary()>=20000 && e1.getSalary()<40000)
				{
					e1.setDesignation("Programmer");
					e1.setInsuranceScheme("Scheme B");
				}
				if(e1.getSalary()>=40000)
				{
					e1.setDesignation("Manager");
					e1.setInsuranceScheme("Scheme A");
				}
				else if(e1.getSalary()<5000)
				{
					e1.setDesignation("Clerk");
					e1.setInsuranceScheme("No Scheme");
				}
			}
			
		}
	
	}
	public String getScheme(String id)
	{
		for(Employee e1:li)
		{
			if(e1.getId().equals(id))
			{
				return e1.getInsuranceScheme();
			}
			
		}
		return null;
	

}

}
