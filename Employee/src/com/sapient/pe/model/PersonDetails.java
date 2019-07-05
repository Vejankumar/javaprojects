package com.sapient.pe.model;
public class PersonDetails {
	private String name;
	private int age;
	Address address;
	
	public PersonDetails(String name,int age,Address address1)
	{
		this.name = name;
		this.age = age;
		address = address1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
