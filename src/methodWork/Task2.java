package methodWork;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name ; ");
		String name = sc.next();
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter rollno : ");
		int rollno = sc.nextInt();
		System.out.println("===============================================================");
		System.out.println("Name : " + name + ", Age : " + age + ", Rollno : " + rollno);
		System.out.println("===============================================================");
		
		
		sc.close();
		
	}
}
