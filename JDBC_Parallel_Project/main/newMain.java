package com.capg.jdbc.par.main;

import java.util.List;
import java.util.Scanner;

import com.capg.jdbc.par.bean.MyWallet;
import com.capg.jdbc.par.service.MyWalletService;
import com.capg.jdbc.par.service.MyWalletServiceImpl;

public class newMain {

	public static void main(String[] args) {
		MyWallet wall;
		MyWalletService wservice=new MyWalletServiceImpl();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String acc = null;
		while(flag){
			System.out.println("\n1.Create Account\n2.Show Balance\n3.Deposit\n4.Withdraw\n5.Fund Transfer\n6.Print Transaction\n7.Exit");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				
				System.out.println("Enter Full name (Eg : Saksham Gupta) : ");
				String fname = sc.next();
				String lname = sc.next();
				String name=fname+" "+lname;
				System.out.println("Enter Age : ");
				int age = sc.nextInt();
				
				System.out.println("Enter Initial Balance : ");
				int initBal = sc.nextInt();
				System.out.println("Enter City : ");
				String address = sc.next();
				wall = new MyWallet(acc, name, age, initBal, address);
				System.out.println("\n_______________________________________________________________________________");
				System.out.println(wservice.create(wall));
				System.out.println("\n_______________________________________________________________________________");
				
				break;
				
			case 2:
				System.out.println("Enter your Account Number");
				acc=sc.next();
				System.out.println(wservice.showBal(acc));
				break;
				
			case 3:
				System.out.println("Enter your Account Number");
				acc=sc.next();
				System.out.println("Enter amount to deposit : ");
				double depositBalance = sc.nextInt();
				System.out.println(wservice.deposit(acc,depositBalance));
				break;
				
			case 4:
				System.out.println("Enter your Account Number");
				acc=sc.next();
				System.out.println("Enter Amount to Withdraw : ");
				int withBalance = sc.nextInt();
				System.out.println(wservice.withdraw(acc,withBalance));
				break;
				
			case 5:
				System.out.println("Enter your Account Number");
				acc=sc.next();
				System.out.println("Enter Reciever's Account Number");
				String acc1=sc.next();
				System.out.println("Enter Amount to Transfer : ");
				int withBalance1 = sc.nextInt();
				System.out.println(wservice.fundTransfer(acc,acc1,withBalance1));
				break;
				
			case 6:
				System.out.println("Enter your Account Number");
				String acc11=sc.next();
				List<String> li=wservice.print(acc11);
				for(String m:li)
				{
					if(m.charAt(0)=='+')
					{
						System.out.println("Credited : "+m.substring(1));
					}
					else
					{
						System.out.println("Debited : "+m.substring(1));
					}
				}
				break;
				
			case 7:
				System.out.println("Thanks for Visting!");
				sc.close();
				flag = false;
				return;
				
			default:
				System.out.println("Invalid Input!");
			
			}
	
	}

}
}
