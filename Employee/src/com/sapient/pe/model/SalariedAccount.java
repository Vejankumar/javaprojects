package com.sapient.pe.model;

public class SalariedAccount extends BankAccount {
	
	private final static int maxdepositamount = 50_000;
	
	public SalariedAccount(PersonDetails details)
	{
		super(details);
		this.setbalance(0);
	}
	
	public double withdraw(double amount)
	{
		
			if(this.getbalance() < amount )
			{
				System.out.println("You dont have that much balance");
				return 0;
			}
			this.setbalance(this.getbalance()-amount);
			System.out.println("Withdraw Completed");
			return this.getbalance();
		
		
	}
	
	public double deposit(double amount)
	{
		if(amount > maxdepositamount)
		{
			System.out.println("mor than max deposit amount");
			return 0;
		}
		this.setbalance(this.getbalance()+amount);
		System.out.println("Deposit Completed");
		return this.getbalance();
	}
	
	public double balanceamount()
	{
		return this.getbalance();
	}
	
}
