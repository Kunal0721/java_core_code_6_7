package stringBuilderWorkAndStringBuffer;

import java.time.LocalDate;

public class Task2 {
	public static void main(String[] args) {
		
		LocalDate n = LocalDate.now();
		System.out.println(LocalDate.now());
		System.out.println("===========================");
		
		LocalDate d =LocalDate.of(2005, 11, 18); 
		
		System.out.println(d.getYear() +  " " +  d.getMonth() );
		System.out.println(d.getDayOfMonth());
		System.out.println(d.getDayOfYear());
		System.out.println(d.getDayOfWeek());
		
		System.out.println("===================================");
		
		LocalDate dob = LocalDate.of(2003, 10, 17);
		
		int age = n.getYear() - dob.getYear();
		System.out.println("age : " + age);
		
	}
}
