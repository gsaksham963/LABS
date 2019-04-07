package com.capg.par.service;

import com.capg.par.bean.MyWallet;

public interface MyWalletService {
	public String create(MyWallet m);
	public String showBal(String acc);
	public String deposit(String acc, double amount);
	public String withdraw(String acc, double amount);
	public String fundTransfer(String acc1,String acc2,double amount);
	public void print(String acc);

}
