package exception.work;

import java.io.File;
import java.io.IOException;

public class Task2 {
	public static void checkAge(int age) {
		if(age >= 18) {
			System.out.println("Welcome to the company");
		}
		else {
			throw new RuntimeException("You are not allowed");
			//System.out.println("You are not allowed");
		}
	}
	
	// h.w. -> Compile time exception & Run Time exception 
	
	public static void main(String[] args) throws IOException  {
			
		File f = new File("Student.txt");
		f.createNewFile();
	}
}
