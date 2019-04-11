package com.capg.par.dao;

import java.util.ArrayList;
import java.util.List;

import com.capg.par.bean.MyWallet;

public class MyWalletDaoImpl implements MyWalletDao{

	static int act1=1000;
	List<MyWallet> li=new ArrayList<MyWallet>();
	double bal1;

	@Override
	public String create(MyWallet m) {
		// TODO Auto-generated method stub
		li.add(m);
		++act1;
		m.setAccountNo(String.valueOf(act1));
		String s1="Successfully Added In Your Acccount Number :: "+(act1);
		bal1=m.getInitBal();
		String s="+"+bal1;
		m.addtrans(s);
		return s1;
	}

	@Override
	public String showBal(String acc) {
		// TODO Auto-generated method stub
		int flag=0;
		String s="";
		for(MyWallet m:li)
		{
			if((m.getAccountNo()).equals(acc))
			{
				flag=1;
				s= "Balance : "+m.getInitBal();
			}
		}
		if(flag==0)
		{
			return "Sorry!! no user with this Account No"; 
		}
		else
		{
			return s;
		}
	}

	@Override
	public String deposit(String acc, double amount) {
		int flag=0;
		String s1="";
		double bal = 0;
		for(MyWallet m:li)
		{
			if((m.getAccountNo()).equals(acc))
			{
				flag=1;
				bal=m.getInitBal()+amount;
				m.setInitBal(bal);
				s1 ="Balance Deposited: "+m.getInitBal();
				bal1=amount;
				String s="+"+bal1;
				m.addtrans(s);
			}
		}
		if(flag==0)
		{
			return "Sorry!! no user with this Account No"; 
		}
		else
		{
			return s1;
		}
	}

	@Override
	public String withdraw(String acc, double amount) {
		// TODO Auto-generated method stub
		int flag=0;
		String s1="";
		double bal = 0;
		for(MyWallet m:li)
		{
			if((m.getAccountNo()).equals(acc))
			{
				flag=1;
				if(m.getInitBal()>=amount)
				{
				bal=m.getInitBal()-amount;
				m.setInitBal(bal);
				s1="Balance Withdrawl Successful: "+m.getInitBal();
				bal1=amount;
				String s="-"+bal1;
				m.addtrans(s);
				}
				else
				{
					return "Not Enough Balance";
				}
			}
		}
		if(flag==0)
		{
			return "Sorry!! no user with this Account No"; 
		}
		else
		{
			return s1;
		}
		
	}

	@Override
	public String fundTransfer(String acc1, String acc2, double amount) {
		// TODO Auto-generated method stub
		int flag1=0;
		int flag2=0;
		String s1 ="";
		for(MyWallet m1:li)
		{
			if((m1.getAccountNo()).equals(acc1))
			{
				if(m1.getInitBal()>=amount)
				{
				flag1=1;
				for(MyWallet m2:li)
				{
					if((m2.getAccountNo()).equals(acc2))
					{
						flag2=1;
						m1.setInitBal(m1.getInitBal()-amount);
						m2.setInitBal(m2.getInitBal()+amount);
						s1="Balance Withdrawl Successful:\nSender: "+m1.getInitBal()+"\nReciever:"+m2.getInitBal();
						bal1=amount;
						String s="-"+bal1;
						m1.addtrans(s);
						s="+"+bal1;
						m2.addtrans(s);
						
					}
				}
				}
				else
				{
					
					return "Not enough balance";
				}
			}
		}
		if(flag1==0)
		{
			return "Sorry!! no Sender with these Account No" +acc1;
		}
		else
		{
			if(flag2==0)
			{
				return "Sorry!! no Reciever with these Account No" +acc1;
			}
			else
			{
				return s1;

			}
		}
		
	}

	
	@Override
	public List<String> print(String acc) {
		// TODO Auto-generated method stub
		int flag=0;
		for(MyWallet m1:li)
		{
			if((m1.getAccountNo()).equals(acc))
			{
				flag=1;
				List<String>lii=m1.getList();
				return lii;
			}
		}
		if(flag==0)
		{
			String s="Sorry!! no user with this Account No"; 
		}	
		return null;
	}		
}		
		
