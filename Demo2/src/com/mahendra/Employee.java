package com.mahendra;

public class Employee {
	private String firstName, lastName;
	private Address address;
	
	public Employee(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	static class Address{
		private String line1, line2, city, state;
	public Address(String line1, String line2, String city,String state) {
		this.line1=line1;
		this.line2=line2;
		this.city=city;
		this.state=state;
	}
	}
}
