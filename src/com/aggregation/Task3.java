package com.aggregation;

public class Task3 {

	public static int simple() {
		try {
			// code..
			return 90;
		} catch (Exception e) {
			System.out.println("error..");
		} finally {
			System.out.println("hello");
		}
		
		return 100;
	}

	public static void main(String[] args) {
		System.out.println(simple());
	}
}
