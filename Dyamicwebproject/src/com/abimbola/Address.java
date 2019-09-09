package com.abimbola;

public class Address {
	
	String city;
	String state;
	int Zipcode;
	
	public Address() {
		
	}

	public Address(String city, String state, int zipcode) {
		super();
		this.city = city;
		this.state = state;
		Zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return Zipcode;
	}

	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", Zipcode=" + Zipcode + "]";
	}
 
}
