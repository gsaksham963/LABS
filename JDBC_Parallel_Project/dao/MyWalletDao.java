package com.capg.jdbc.par.dao;

import java.util.List;

import com.capg.jdbc.par.bean.MyWallet;

public interface MyWalletDao {

		public String create(MyWallet m);
		public String showBal(String acc);
		public String deposit(String acc, double amount);
		public String withdraw(String acc, double amount);
		public String fundTransfer(String acc1,String acc2,double amount);
		public List<String> print(String acc);
		
}
