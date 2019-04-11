package com.capg.jdbc.par.bean;

public class MyWallet {
	
	private String accountNo;
	private String name;
	private int age;
	private double initBal;
	private String bal;
	private String address;

	
	
	
	public MyWallet(String accountNo, String bal) {
		super();
		this.accountNo = accountNo;
		this.bal = bal;
	}

	public MyWallet(String accountNo, String name, int age, double initBal, String address) {
		super();
		this.accountNo=accountNo;
		this.name = name;
		this.age = age;
		this.initBal = initBal;
		this.address = address;
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

	public String getBal() {
		return bal;
	}

	public void setBal(String bal) {
		this.bal = bal;
	}
	
}