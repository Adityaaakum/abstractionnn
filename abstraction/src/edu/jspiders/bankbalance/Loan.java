package edu.jspiders.bankbalance;

public class Loan  implements Account{
	int accnum;
	String accname;
	double balance;
	double deposit;
	double withdraw;
	double loan;
	
	
	public Loan(int accnum, String accname, double balance, double deposit, double withdraw, double loan) {
		super();
		this.accnum = accnum;
		this.accname = accname;
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.loan = loan;
	}
	public void withdraw(String accname,double withdraw)
	{
		System.out.println("welcome "+accname);
		System.out.println("Loan alerady taken is "+loan);
		System.out.println("amount withdrawn = "+withdraw);
	}
	public void deposit(String accname,double deposit)
	{
		System.out.println("amount deposited to ypur loan"+deposit);
	}
	public void checkbalance(double balance,double deposit,double withdraw)
	{
		balance=deposit-(loan+withdraw);
		System.out.println("balance is ="+balance);
	}
	

}
