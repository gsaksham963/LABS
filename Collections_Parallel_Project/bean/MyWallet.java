package com.capg.par.bean;

import java.util.ArrayList;
import java.util.List;

public class MyWallet {

	private String accountNo;
	private String name;
	private int age;
	private double initBal;
	private String address;
	private String uID;
	private String pass;
	List<String> trans;
	public MyWallet(String accountNo, String name, int age, double initBal, String address, String uID, String pass) {
		super();
		trans=new ArrayList<String>();
		this.accountNo=accountNo;
		this.name = name;
		this.age = age;
		this.initBal = initBal;
		this.address = address;
		this.uID = uID;
		this.pass = pass;
	}
	public void addtrans(String s)
	{
		trans.add(s);
	}
	public List<String> getList()
	{
		return trans;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getInitBal() {
		return initBal;
	}
	public void setInitBal(double initBal) {
		this.initBal = initBal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUID() {
		return uID;
	}
	public void setUID(String uID) {
		this.uID = uID;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
