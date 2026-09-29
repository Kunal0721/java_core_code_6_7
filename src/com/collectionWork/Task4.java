package com.collectionWork;

class Practice<T> {
	T a;

	public Practice(T a) {
		this.a = a;
	}

	public void display() {
		System.out.println("Your data is : " + a);
	}
}

class Student{
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Task4 {
	public static void main(String[] args) {
		Practice<Integer> p = new Practice<>(10);
		p.display();

		Practice<Double> p2 = new Practice<>(17.89);
		p2.display();

		Practice<Boolean> p3 = new Practice<>(true);
		p3.display();
		
		Practice<Student> ps = new Practice<>(new Student("Riya", 19));
		ps.display();
	
	}
}
