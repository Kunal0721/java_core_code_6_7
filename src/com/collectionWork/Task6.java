package com.collectionWork;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private Integer id;
	private String name;
	private Integer age;
	public Employee(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}


public class Task6 {
	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<>();
		ls.add(new Employee(101, "Ritika", 29));
		ls.add(new Employee(102, "Shivani", 29));
		ls.add(new Employee(103, "Ritika", 29));
		ls.add(new Employee(104, "Sohan", 29));
		ls.add(new Employee(105, "Mohan", 29));
		ls.add(new Employee(106, "Mohit", 29));
		
		for(Employee e : ls) System.out.println(e);
		
		ls.set(2, new Employee(115, "Roshini", 20));
		System.out.println("=========================================");
		
		for(Employee e : ls) System.out.println(e);
		
		System.out.println("======================================");
		
		ls.add(null);
		ls.add(null);
		
		for(Employee e : ls) System.out.println(e);
		
 	
		
	}
}
