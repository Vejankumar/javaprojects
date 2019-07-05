package com.sapient.pe.model;

public class CurrentAccount extends BankAccount {
	private final static int minaccountbalance = 25_000;
	
	public CurrentAccount(PersonDetails details)
	{
		super(details);
		this.setbalance(25000);
	}
	
	public double withdraw(double amount)
	{
		
			if(this.getbalance()-amount < minaccountbalance)
			{
				System.out.println("You dont have that much balance ");
				return 0;
			}
			this.setbalance(this.getbalance()-amount);
			System.out.println("Withdrawl completed");
			return this.getbalance();
		
		
	}
	
	public double deposit(double amount)
	{
		
		this.setbalance(this.getbalance()+amount);
		System.out.println("Deposit Completed");
		return this.getbalance();
	}
	
	public double balanceamount()
	{
		return this.getbalance();
	}
}
