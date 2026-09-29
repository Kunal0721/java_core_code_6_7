package com.collectionWork;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("somesh");
		ls.add("Ritika");
		ls.add("Ritika");
		ls.add("suhani");
		ls.add("Rashi");
		ls.add("Rohan");
		
		System.out.println(ls);
//		System.out.println(ls.get(2));
		
		for(String s : ls) System.out.println(s);
		ls.remove(3);
		System.out.println(ls);
		ls.set(0, "Raj");
		System.out.println(ls);
		
		System.out.println(ls.contains("rohan"));
	}
}
