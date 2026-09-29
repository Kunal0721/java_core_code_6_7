package oopEncapsulation;

public class Task1 {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("umang");
		s.setAge(190);
		s.setEmail("umang@gmail.com");
		s.setRollno(10900);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getEmail());
		System.out.println(s.getRollno());
		
		// Product -> name, price ( > 0), 
//				description, stockQuantity (positive)
//				rating (0.0 to 5.0)
	}
}
