package edu.jspiders.bankbalance;

public class Savings implements Account {
	int accnum;
	String accname;
	double balance;
	double withdraw;
	double deposit;
	
	
 public Savings(int accnum, String accname, double balance, double deposit,  double withdraw) {
		
		this.accnum = accnum;
		this.accname = accname;
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		
	}


public void withdraw(String accname,double withdarwn)
 {
	System.out.println("welcome "+accname);
	System.out.println("ammount withdrawn is "+withdraw);
 }
 public void deposit(String accname,double deposit)
{
	//System.out.println("welcome "+accname);
	System.out.println("amount deposited="+deposit);
}
	public void checkbalance(double balance,double deposit,double withdraw)
	{
		balance=deposit-withdraw;
		System.out.println("balance is ="+balance);
	}




}
