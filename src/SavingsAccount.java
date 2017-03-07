<<<<<<< HEAD

public class SavingsAccount extends BankAccount {
	double interest=.05,maxWithLimit,interestbalance;
	

	public SavingsAccount(String memberName, double accountBalance, double maxWithLimit) {
		super(memberName, accountBalance, 2000);
		this.maxWithLimit=maxWithLimit;
	}
	double getBalance(int year)
	{
		interestbalance = (accountBalance+ ((accountBalance*interest)*year));
		return interestbalance;
	}
	void withdraw(double balance)
	{
		if(balance>maxWithLimit)
		{
			System.out.println("Maximum withdraw limit exceeded");
		}
		else if(accountBalance - balance <= minimumBalance)
		{
			System.out.println("Minimum Balance limit exceeded");
		}
		else
			accountBalance-=balance;
	}
	
	
=======

public class SavingsAccount extends BankAccount {
	double interest=.05,maxWithLimit,interestbalance;
	

	public SavingsAccount(String memberName, double accountBalance, double maxWithLimit) {
		super(memberName, accountBalance, 2000);
		this.maxWithLimit=maxWithLimit;
	}
	double getBalance(int year)
	{
		interestbalance = (accountBalance+ ((accountBalance*interest)*year));
		return interestbalance;
	}
	void withdraw(double balance)
	{
		if(balance>maxWithLimit)
		{
			System.out.println("Maximum withdraw limit exceeded");
		}
		else if(accountBalance - balance <= minimumBalance)
		{
			System.out.println("Minimum Balance limit exceeded");
		}
		else
			accountBalance-=balance;
	}
	
	
>>>>>>> origin/master
}