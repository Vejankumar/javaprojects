
package com.sapient.pe.model;

abstract public class BankAccount {
	
	
	private String accountname;
	private static long idcounter=100 ;
	private double amount = 0;
	private final long id;
	private Address customeraddress;
	
	public BankAccount(PersonDetails details)
	{
		this.accountname = details.getName();
		customeraddress = details.getAddress();
		this.id=idcounter++;
	}
	
/*	public BankAccount(String name,AccountType type,Address address)
	{
		this.accountname = name;
		this.id = idcounter++;
		this.accounttype = type;
		customeraddress = address;
		System.out.println("Congratulations your "+type+" is created");
	}*/
	
		
	
	
	public void setaddress(Address customeraddress1)
	{
		customeraddress = customeraddress1;
	}
	
	public double getbalance() {
		return amount;
	}
	
	public abstract double deposit(double amount);
	
	public abstract double withdraw(double amount);
	
	public double setbalance(double amount)
	{
		this.amount = amount;
		return amount;
	}
	
	public long getid()
	{
		return id;
	}

}