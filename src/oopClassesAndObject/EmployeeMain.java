package oopClassesAndObject;

import java.time.LocalDate;

enum Gender{
	MALE, FEMALE, OTHERS
}

enum Department{
	IT, SALES, HR, MANAGER, ADMIN, TESTER, SOFTWARE
}

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "Rajul";
		e.dob = LocalDate.of(1998, 11, 19);
		e.salary = 98000;
		e.email = "rajul23@gmail.com";
		e.address = "Vijay nagar indore";
		
		e.display();
		
		Employee e2 = new Employee("Kunal", LocalDate.of(1994, 7, 19), 89000, "kunal0721@gmail.com", "nanda nagar", Gender.MALE, Department.SOFTWARE);
		e2.display();
		
		System.out.println("================================================");

		
	}
}