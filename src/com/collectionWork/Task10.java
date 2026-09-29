package com.collectionWork;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Task10 {
	public static void main(String[] args) {
		
		
		TreeSet<String> t = new TreeSet<String>(Collections.reverseOrder());
		t.add("roshini");
		t.add("ritika");
		t.add("raj");
		t.add("ranjan");
		t.add("abhijeet");
		t.add("bhumi");
		t.add("shilpa");
		
		System.out.println(t);
	}
}
