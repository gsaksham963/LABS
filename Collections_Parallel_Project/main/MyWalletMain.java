package com.capg.par.main;

import java.io.IOException;
import java.util.Scanner;
import com.capg.par.bean.MyWallet;
import com.capg.par.service.MyWalletService;
import com.capg.par.service.MyWalletServiceImpl;

public class MyWalletMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a=1000;
		MyWallet wallet;
		MyWalletService wservice=new MyWalletServiceImpl();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//		String penguinClearConsole = "clear";
//		String os = System.getProperty("os.name");
//		if(os.startsWith("Windows")){
//			Runtime.getRuntime().exec(penguinClearConsole);
//		}
		boolean flag = true;
		String acc;
		while(flag){
			System.out.println("\n1.Create Account\n2.Show Balance\n3.Deposit\n4.Withdraw\n5.Fund Transfer\n6.Print Transaction\n7.Exit");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter UID");
				String uID=sc.next();
				System.out.println("Enter Password");
				String pass=sc.next();
				
				System.out.println("Enter Full name (Eg : SakshamGupta) : ");
				String fname = sc.next();
				String lname = sc.next();
				String name=fname+" "+lname;
				System.out.println("Enter Age : ");
				int age = sc.nextInt();
				
				System.out.println("Enter Initial Balance : ");
				int initBal = sc.nextInt();
				System.out.println("Enter City : ");
				String address = sc.next();
				wallet = new MyWallet(String.valueOf(a), name, age, initBal, address, uID, pass);
				System.out.println("\n_______________________________________________________________________________");
				System.out.println(wservice.create(wallet));
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
				acc=sc.next();
				wservice.print(acc);
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
