package com.collectionWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Task7 {
	public static void main(String[] args) {
		
		List<String> ls2 = new ArrayList<>();
		List<String> ls = new Vector<>();
		Stack<String> stack = new Stack<>();
		
		ls.add("Umang");
		ls.add("Raj");
		ls.add("Rohit");
		ls.add("Rohan");
		ls.add("Mohan");
		ls.add("Shivam");
		ls.add("Shivani");
		
		System.out.println(ls);
		
		System.out.println(ls.get(3));
		ls.add(3, "Infoviaan");
		System.out.println(ls);
		ls.set(5, "Raghav");
		System.out.println(ls);
		
//		for(String s : ls) System.out.println(s);
		
		ls.remove("rohan");
		System.out.println(ls);
			
	}
}