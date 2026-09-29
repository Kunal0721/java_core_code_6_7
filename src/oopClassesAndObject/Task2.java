package oopClassesAndObject;

import java.time.LocalDate;

public class Task2 {
	public static void main(String[] args) {
		Person pr = new Person("Jaykant", LocalDate.of(1997, 6, 19), "jaykant@gmail.com", "Vijay nagar");
		pr.display();
	}
}
