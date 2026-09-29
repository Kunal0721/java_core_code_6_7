package com.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Task2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
	
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student.ser"));
		Student s = (Student )in.readObject();
		System.out.println(s);
		in.close();
	}
}
