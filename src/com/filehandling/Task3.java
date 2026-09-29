package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Enter 1 for add student in a file
// Enter 2 for get Student 
// Enter 3 for read student 

public class Task3 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter w = new BufferedWriter(new FileWriter("Student.csv", true));
		
		
		System.out.println("Enter name : ");
		String name = sc.next();
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter marks : ");
		double marks = sc.nextDouble();
		
		w.write(name + "," + age + "," + marks + "\n");
		
		w.close();
		System.out.println("Save successfully...");
		sc.close();
	}
}
