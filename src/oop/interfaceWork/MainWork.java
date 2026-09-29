package oop.interfaceWork;

public class MainWork {
	public static void main(String[] args) {
		Employee emp[] = new Employee[3];
		emp[0] = new Employee("Raj", 90000, "raj78@gmail.com", Department.HR);
		emp[1] = new Employee("Rajesh", 90000, "rajesh8@gmail.com", Department.IT);
		emp[2] = new EmployeeIntern("Rakesh", 90000, "rakesh78@gmail.com", Department.HR);

		for (Employee e : emp) {
			if (e instanceof Intern) {
				System.out.println("yes : " + e.getName() + " is an intern " + e);
			} else {
				System.out.println(e.getName() + " is not an intern "   + e);
			}
		}
	}
}
