package oopClassesAndObject;

import java.time.LocalDate;

public class Employee {
	String name;
	LocalDate dob;
	double salary;
	String email;
	String address;
	Gender gender;
	Department dept;
	
	// default : 
	public Employee() {
		System.out.println("This is a constructor...");
	}
	
	// parameterize : 
	public Employee(String n, LocalDate d, double s, String e, String ad, Gender g, Department dep) {
		name = n;
		dob = d;
		salary = s;
		email = e;
		address = ad;
		gender = g;
		dept = dep;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("DOB  : " + dob);
		System.out.println("Salary : "+ salary);
		System.out.println("Email : "+ email);
		System.out.println("Address : "+ address);
		System.out.println("Gender  : "  + gender);
		System.out.println("Department : "  + dept);
		System.out.println("======================================");
	}
}
