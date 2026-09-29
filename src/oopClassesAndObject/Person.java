package oopClassesAndObject;

import java.time.LocalDate;

public class Person {
	String name;
	LocalDate dob;
	String email;
	String address;

	public Person() {
	}

	public Person(String name, LocalDate dob, String email, String address) {
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.address = address;
	}

	public void display() {
		System.out.println("Name " + name);
		System.out.println("Dob : " + dob);
		System.out.println("Email : " + email);
		System.out.println("Address : " + address);
	}

}
