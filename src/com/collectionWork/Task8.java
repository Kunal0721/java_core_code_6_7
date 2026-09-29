package com.collectionWork;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Task8 {
	public static void main(String[] args) {
		List<String> ls = new LinkedList<>();
		
		Stack<String> s = new Stack<>();
		s.push("Raj");
		s.push("Rajesh");
		s.push("Rohit");
		s.push("Ranjan");
		s.push("Rakesh");
		s.push("Ritika");
	
		System.out.println(s.isEmpty());
//		System.out.println(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		System.out.println(s.isEmpty());
		
	
	}
}
