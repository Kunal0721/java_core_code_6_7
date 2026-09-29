package oopClassesAndObject;

class Student{
	String name;
	int age;
	int rollno;
	
	public void display() {
		System.out.println("Name : " + name );
		System.out.println("Age : " + age);
		System.out.println("Rollno : "  + rollno);
	}
}

// h.w. : constructor 

public class Task1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Ritik";
		s.age = 19;
		s.rollno = 109;
		s.display();
		
		// Employee -> id, name, email, salary, dob(LocalDate) 
		
		System.out.println("===============================");
		
		Student s2 = new Student();
		s2.name = "Shivam";
		s2.age = 18;
		s2.rollno = 108;
		
		s2.display();
	
	}
}
