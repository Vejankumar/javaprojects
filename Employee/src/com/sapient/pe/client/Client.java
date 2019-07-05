package com.sapient.pe.client;

import com.sapient.pe.model.BankAccount;
import com.sapient.pe.model.CurrentAccount;
import com.sapient.pe.model.SavingsAccount;
import com.sapient.pe.model.Address;
import com.sapient.pe.model.PersonDetails;
import com.sapient.pe.model.SalariedAccount;
import com.sapient.pe.model.Employee;

import java.util.List;
import java.lang.String;
import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;



public class Client {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
	/*	Employee vejan = new Employee(73,"vejan",67_000);
		System.out.println("Initial vacation days "+ vejan.getVacationDays());
		vejan.applyforLeave(20);
		System.out.println("After applying for leaves "+ vejan.getVacationDays());
		vejan.applyforLeave(20);*/
		
		int createaccount = 0;
		System.out.println("If you want to create an account press 1 ");
		System.out.println("If you want to do any action on account press 2 ");
		createaccount = kb.nextInt();
		List<BankAccount> list =  new ArrayList<>();
		int done=1;
		if(createaccount == 1)
		{
			kb.nextLine();
			System.out.println("Please enter the street name");
			String street = kb.nextLine();
			System.out.println("Please enter the city name");
			String city = kb.nextLine();
			System.out.println("Please enter the country name");
			String country = kb.nextLine();
			System.out.println("Please enter the zipcode");
			int zipcode = kb.nextInt();
			Address sri_address = new Address(street,city,country,zipcode);
			kb.nextLine();
			System.out.println("Please enter the person name");
			String name = kb.nextLine();
			System.out.println("Please enter the person age");
			int age = kb.nextInt();
			
			PersonDetails details = new PersonDetails(name,age,sri_address);
			
			System.out.println("Please enter the employeeid");
			int id = kb.nextInt();
			System.out.println("Please enter the salary");
			double salary = kb.nextDouble();
			
			
			Employee vejan = new Employee(id,details,salary);
			
			
			
			
			//Address address = new Address("4th Cross","Bangalore","Karnataka",456110);
			//PersonDetails details = new PersonDetails("Kiran",21,address);
			System.out.println("Enter which type of account yopu want");
			System.out.println("1 Savings");
			System.out.println("2 Current");
			System.out.println("3 Salaried");
			
			System.out.println();
			int accounttype = kb.nextInt();
			System.out.println();
			
			
			
			
			if(accounttype == 1)
			{
				SavingsAccount sa = new SavingsAccount(details);
				list.add(sa);
				actions(sa);
			}
			else if(accounttype == 2)
			{
				CurrentAccount ca = new CurrentAccount(details);
				list.add(ca);
				actions(ca);
			}
			else
			{
				SalariedAccount saa = new SalariedAccount(details);
				list.add(saa);
				actions(saa); 
			}
			System.out.println("If you want to do some more operations on other accounts 1  ");
			System.out.println("If you want to exit press 2 ");
			done = kb.nextInt();
		}
		
		
		while(done == 1)
		{
			System.out.println("Enter your account id ");
			long accountnum = kb.nextLong();
			BankAccount selectedAccount = null;
			for(BankAccount i:list)
			{
				if(i.getid() == accountnum) {
					selectedAccount = i;
					break;
					
				}
			}
			if(selectedAccount == null){
				System.out.println("The account ID is not present ");
			}else {
				actions(selectedAccount);
			}
			System.out.println("If you want to do some more operations press 1  ");
			System.out.println("If you want to exit press 2 ");
			done = kb.nextInt();
			
		}
		
		System.out.println("Thankyou for visiting ");

	}

	
	
	private static void actions(BankAccount account) {
		
		/*Scanner kb =  new Scanner(System.in);
		kb.nextInt();
		Address address = new Address("4th Cross","Bangalore","Karnataka",456110);
		PersonDetails details = new PersonDetails("Kiran",21,address);
		BankAccount account = new SavingsAccount(details);
		return account;*/
		while(true)
		{
			Scanner kb =  new Scanner(System.in);
			System.out.println("Choose action");
			System.out.println("1 : Deposit Money");
			System.out.println("2 : Withdraw Money");
			System.out.println("3 : View Balance");
			System.out.println("4: No actions");
			System.out.println();
			System.out.println("Choose action");
			System.out.println();
			int action = kb.nextInt();
			double amount = 0;
			switch(action)
			{
			case 1:
				System.out.println("Enter how much money you want to deposit");
				System.out.println();
				amount = kb.nextDouble();
				
				account.deposit(amount);
				System.out.println();
				break;
			case 2:
				System.out.println("Enter how much money you want to withdraw");
				System.out.println();
				amount = kb.nextDouble();
				
				account.withdraw(amount);
				System.out.println();
				break;
			case 3:
				System.out.println("your account balance is "+account.getbalance());
				System.out.println();
				break;
			case 4:
				return ;
			}
	}

}
}
