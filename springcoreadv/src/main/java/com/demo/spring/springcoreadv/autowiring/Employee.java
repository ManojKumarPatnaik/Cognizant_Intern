package com.demo.spring.springcoreadv.autowiring;

public class Employee {
	
	
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [ address=" + address.toString() + "]";
	}
	
	
}
