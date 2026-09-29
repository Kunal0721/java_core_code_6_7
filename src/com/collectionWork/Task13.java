package com.collectionWork;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Task13 {
	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		map.put(101, "Shivam");
		map.put(102, "Shivani");
		map.put(103, "Raj");
		map.put(104, "Shivam");
		map.put(105, "Raghav");
		map.put(101, "Rakesh");
		map.put(11, "Mohan");
		map.put(3, "Rohan");
		map.put(98, "Raj");

		System.out.println(map);

		System.out.println(map.get(102));
		map.remove(98);
		System.out.println(map);
	}
}
