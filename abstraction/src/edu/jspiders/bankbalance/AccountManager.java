package edu.jspiders.bankbalance;

import java.util.Scanner;

public class AccountManager {
	public static Account provideDetails(int accnum,String name,char type,double balance,double deposit,double withdraw)
	{
		Account ref= null;
		if(type=='s')
		{
			ref= new Savings(accnum, name, balance, deposit, withdraw);
		}
		else if(type=='l')
		{
			System.out.println("Enter the intial loan you want to take");
			Scanner sc= new Scanner(System.in);
			double Loan=sc.nextDouble();
			ref= new Loan(accnum, name, balance,deposit, withdraw, Loan);
		}
		return ref;
	}

}
