package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Jayesh.txt", true));
		bw.write("\nName : Rohit, Age : 19");
		bw.close();

	}
}
