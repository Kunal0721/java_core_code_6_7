package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String fileName = "Student.csv";
		BufferedWriter w = new BufferedWriter(new FileWriter(fileName, true));

		//		w.write("Name, Age, Rollno, Marks\n");
		//		w.write("Shivam, 19, 109, 497\n");
		//		w.write("Roshini, 19, 110, 467\n");
		//		w.write("Rajesh, 19, 198, 457\n");
		//		w.write("Rajni, 19, 107, 397\n");

		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter rollno : ");
		int rollno = sc.nextInt();
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		w.write(name + "," + age + "," + rollno + "," + marks + "\n");
		System.out.println("Data save : " + fileName);
		w.close();
		sc.close();
	}
}
