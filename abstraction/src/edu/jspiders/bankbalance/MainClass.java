package edu.jspiders.bankbalance;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Account ref= null;
		AccountManager ac= new AccountManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account number");
		int accnum=sc.nextInt();
		System.out.println("Enter the accname");
		String accname= sc.next();
		System.out.println("Enter the type of account");
		char c= sc.next().charAt(0);
		  double balance=0.0;
		System.out.println("enter the amount to be withdrawn");
		double withdraw=sc.nextDouble();
		System.out.println("Enter the amount to be deposited");
		double deposited=sc.nextDouble();
		
		ref=ac.provideDetails(accnum, accname, c, balance,deposited,withdraw);
		ref.withdraw(accname, withdraw);
		ref.deposit(accname, deposited);
		ref.checkbalance(balance, deposited, withdraw);
	}

}
