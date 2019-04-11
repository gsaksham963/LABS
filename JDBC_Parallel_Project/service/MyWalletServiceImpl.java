package com.capg.jdbc.par.service;

import java.util.List;

import com.capg.jdbc.par.bean.MyWallet;
import com.capg.jdbc.par.dao.MyWalletDao;
import com.capg.jdbc.par.dao.MyWalletDaoImpl;

public class MyWalletServiceImpl implements MyWalletService{

	MyWalletDao mdao=new MyWalletDaoImpl();
	@Override
	public String create(MyWallet m) {
		// TODO Auto-generated method stub
		int flag1=0,flag2=0,flag3=0;
		String userNamePattern="[A-Z]{1}[a-z]{2,}\\s[A-Z]{1}[a-z]{2,}";
		//String userNamePattern2="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.{3,})";
		if(m.getName().matches(userNamePattern)) {
			flag1=1;
		}
		else
		{
			return "Wrong Name Pattern";
		}
		if(m.getAge()>=18 && m.getAge()<=100)
		{
			flag2=1;
		}
		else
		{
			return "Age less than 18 not allowed";
		}
		if(m.getInitBal()>500)
		{
			flag3=1;
		}
		else
		{
			return "Minimum Balance is 500";
		}
		if(flag1==1 && flag2==1 && flag3==1)
		{
			return mdao.create(m);
		}
		else
		{
			return "Account Not Created";
		}
	
	}

	@Override
	public String showBal(String acc) {
		// TODO Auto-generated method stub
		return mdao.showBal(acc);
	}

	@Override
	public String deposit(String acc, double amount) {
		// TODO Auto-generated method stub
		if(amount<100)
		{
			return "Minimum amount is 100";
		}
		else
		{
			return mdao.deposit(acc, amount);
		}
	}

	@Override
	public String withdraw(String acc, double amount) {
		// TODO Auto-generated method stub
		return mdao.withdraw(acc, amount);
	}

	@Override
	public String fundTransfer(String acc1, String acc2, double amount) {
		// TODO Auto-generated method stub
		if(acc1.equals(acc2))
		{
			return "Sender and Reciever can't be same";
		}
		else
		{
			return mdao.fundTransfer(acc1, acc2, amount);
		}
	}

	@Override
	public List<String> print(String acc) {
		return mdao.print(acc);
		// TODO Auto-generated method stub
		
	}

}
