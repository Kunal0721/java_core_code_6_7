package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Tsak1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\simple\\balram.txt");

//		if (f.createNewFile()) {
//			System.out.println("File is created.");
//		} else {
//			System.out.println(f.getAbsolutePath());
//			System.out.println("It is not");
//		}

		if (f.delete()) {
			System.out.println("file is deleted..");
		} else {
			System.out.println("File is not deleted..");
		}
	}
}
