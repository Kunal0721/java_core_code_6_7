package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
	public static void main(String[] args) throws IOException {
		BufferedWriter w = new BufferedWriter(new FileWriter("Simple.txt"));
		w.write("\nHello Kartik");
		w.close();
	}
}
