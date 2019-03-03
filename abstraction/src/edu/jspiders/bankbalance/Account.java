package edu.jspiders.bankbalance;

public interface Account {
	void withdraw(String accname,double withdraw);
	void deposit(String accname,double deposit);
	void checkbalance(double balance,double deposit,double withdraw);

}
