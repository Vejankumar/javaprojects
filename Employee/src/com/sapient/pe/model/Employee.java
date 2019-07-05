package com.sapient.pe.model;




public class Employee {
	
	private int id;
	private PersonDetails details;
	private double salary;
	private int vacationDays = 30;
	
	public Employee(int id,PersonDetails details1,double salary)
	{
		details = details1;
		this.id = id;
		this.salary = salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	

	public PersonDetails getDetails() {
		return details;
	}

	public void setDetails(PersonDetails details) {
		this.details = details;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
	
	public void applyforLeave(int noofDays) {
		if(this.vacationDays >= noofDays)	
			this.vacationDays -= noofDays;
		else {
			System.out.println("You do not have sufficient leave balance to approve");
		}
	}

	
}
