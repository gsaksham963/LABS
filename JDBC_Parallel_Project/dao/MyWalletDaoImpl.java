package com.capg.jdbc.par.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capg.jdbc.par.bean.MyWallet;
import com.capg.jdbc.par.util.MyConnection;

public class MyWalletDaoImpl implements MyWalletDao{

	static int act1=1000;
	Connection con=MyConnection.getConnection();
	PreparedStatement ps;
	String res;
	double bal1;
	@Override
	public String create(MyWallet m) {
		// TODO Auto-generated method stub
		try {
			++act1;
			m.setAccountNo(String.valueOf(act1));
			ps=con.prepareStatement("insert into wallet values(?,?,?,?,?)");
			ps.setString(1, m.getAccountNo());
			ps.setString(2, m.getName());
			ps.setInt(3, m.getAge());
			ps.setDouble(4, m.getInitBal());
			ps.setString(5, m.getAddress());
			int x=ps.executeUpdate();
			if(x!=0)
			{
				res= res= "Successfully Added In Your Acccount Number :: "+(act1);
			}
			else
			{
				res= "Account not Created";
			}
			bal1=m.getInitBal();
			String s="+"+bal1;
			ps=con.prepareStatement("insert into trans values(?,?)");
			ps.setString(1, m.getAccountNo());
			ps.setString(2, s);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
		
	}

	@Override
	public String showBal(String acc) {
		// TODO Auto-generated method stub
		try {
			ps=con.prepareStatement("select bal from wallet where accountno like ?");
			ps.setString(1, acc);
			ResultSet rs=ps.executeQuery();
			rs.next();
			return String.valueOf(rs.getDouble(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deposit(String acc, double amount) {
		// TODO Auto-generated method stub
		try {
			ps = con.prepareStatement("update wallet set bal = bal + ? where accountno = ?");
			ps.setDouble(1, amount);
			ps.setString(2, acc);
			int a=ps.executeUpdate();
			if(a>0)
			{
				String s="+"+amount;
				ps=con.prepareStatement("insert into trans values(?,?)");
				ps.setString(1, acc);
				ps.setString(2, s);
				ps.execute();
				res= "Successfully Deposited";
			}
			else
			{
				res= "Cant Deposit";
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public String withdraw(String acc, double amount) {
		// TODO Auto-generated method stub
		try {
			ps=con.prepareStatement("select bal from wallet where accountno like ?");
			ps.setString(1, acc);
			ResultSet rs=ps.executeQuery();
			rs.next();
			if(rs.getDouble(1)>=amount)
			{
				ps = con.prepareStatement("update wallet set bal = bal - ? where accountno = ?");
				ps.setDouble(1, amount);
				ps.setString(2, acc);
				int a=ps.executeUpdate();
				if(a>0)
				{
					String s="-"+amount;
					ps=con.prepareStatement("insert into trans values(?,?)");
					ps.setString(1, acc);
					ps.setString(2, s);
					ps.execute();
					res="Balance Deducted";
				}
				else
				{
					res="error";
				}
			}
			else
			{
				res="not enough Balance";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public String fundTransfer(String acc1, String acc2, double amount) {
		// TODO Auto-generated method stub
		try {
			ps=con.prepareStatement("select bal from wallet where accountno like ?");
			ps.setString(1, acc1);
			ResultSet rs=ps.executeQuery();
			rs.next();
			if(rs.getDouble(1)>=amount)
			{
				ps = con.prepareStatement("update wallet set bal = bal - ? where accountno = ?");
				ps.setDouble(1, amount);
				ps.setString(2, acc1);
				int a=ps.executeUpdate();
				ps = con.prepareStatement("update wallet set bal = bal + ? where accountno = ?");
				ps.setDouble(1, amount);
				ps.setString(2, acc2);
				a=ps.executeUpdate();
				if(a>0)
				{
					String s="-"+amount;
					ps=con.prepareStatement("insert into trans values(?,?)");
					ps.setString(1, acc1);
					ps.setString(2, s);
					ps.execute();
					String s1="+"+amount;
					ps=con.prepareStatement("insert into trans values(?,?)");
					ps.setString(1, acc2);
					ps.setString(2, s1);
					ps.execute();
					
					res="Balance Deducted";
				}
				else
				{
					res="error";
				}
			}
			else
			{
				res="not enough Balance";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public List<String> print(String acc) {
		// TODO Auto-generated method stub
		List<String> li= new ArrayList<String>();
		try {
			ps=con.prepareStatement("select bal from trans where accountno like ?");
			ps.setString(1, acc);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				li.add(rs.getString(1));
			}
			ps.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
		
	}
}
