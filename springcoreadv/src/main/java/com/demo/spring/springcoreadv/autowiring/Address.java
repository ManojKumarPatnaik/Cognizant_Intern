package com.demo.spring.springcoreadv.autowiring;

public class Address {
	private int hno;
	private String street;
	private String city;
//	public Address(int hno, String street, String city) {
//		super();
//		this.hno = hno;
//		this.street = street;
//		this.city = city;
//	}

	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}
	
	
}
