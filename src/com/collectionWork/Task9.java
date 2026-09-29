package com.collectionWork;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task9 {
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<>();
		s.add("Shivam"); // Shivam -> 1 
		s.add("Rohan");  // Rohan -> 4
		s.add("Raj");     // Raj -> 2
		s.add("Roshini");  // Roshini -> 3
		
		System.out.println(s );
		s.add("Roshini");  // Roshini -> 3 
		System.out.println(s);
		s.add(null);
		System.out.println(s);
	}
}
