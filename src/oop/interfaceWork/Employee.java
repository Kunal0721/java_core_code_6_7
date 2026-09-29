package oop.interfaceWork;

enum Department {
	IT, SOFTWARE, HR, MANAGER, SALES
}

// marker interface
interface Intern{
	
}

public class Employee {
	private String name;
	private double price;
	private String email;
	private Department department;

	public Employee(String name, double price, String email, Department department) {
		super();
		this.name = name;
		this.price = price;
		this.email = email;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", price=" + price + ", email=" + email + ", department=" + department + "]";
	}

}

class EmployeeIntern extends Employee implements Intern{

	public EmployeeIntern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeIntern(String name, double price, String email, Department department) {
		super(name, price, email, department);
		// TODO Auto-generated constructor stub
	}
	
}
