package com.sapient.pe.model;

public class SavingsAccount extends BankAccount {
	private final static int minaccountbalance = 10_000;
	private final static int withdrawllimit = 25_000;
	private final static int maxdepositamount = 50_000;
	
	public SavingsAccount(PersonDetails details)
	{
		super(details);
		this.setbalance(10000);
	}
	
	public double withdraw(double amount)
	{
		if(amount <= withdrawllimit)
		{
			if(this.getbalance()-amount < minaccountbalance)
			{
				System.out.println("You dont have that much balance");
				return 0;
			}
			this.setbalance(this.getbalance()-amount);
			System.out.println("Transaction Completed");
			return this.getbalance();
		
		}
		System.out.println("More than withdrawl limit");
		return 0;
	}
	
	public double deposit(double amount)
	{
		if(amount > maxdepositamount)
		{
			System.out.println("mor than max deposit amount");
			return 0;
		}
		this.setbalance(this.getbalance()+amount);
		return this.getbalance();
	}
	
	public double getamount()
	{
		return this.getbalance();
	}

}
