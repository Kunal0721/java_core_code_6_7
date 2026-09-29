package com.serializationAndDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Student s = new Student(101, "Shivam", 98.78);
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Student.ser"));
		os.writeObject(s);
		os.close();
		
		System.out.println("serialize successfully...");
		
	}
}
