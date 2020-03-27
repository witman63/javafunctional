package nl.martin.combinator;

import java.time.LocalDate;

public class Customer {
	
	private  String naam;
	private final String email;
	private final String phoneNumber;
	private final LocalDate dob;
	

	
	public Customer(String naam, String email, String phoneNumber, LocalDate dob) {
		super();
		this.naam = naam;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}
	private void setNaam(String naam) {
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public LocalDate getDob() {
		return dob;
	}
	
	

}
