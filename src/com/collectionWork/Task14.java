package com.collectionWork;

import java.util.HashMap;
import java.util.Map;

public class Task14 {
	public static void main(String[] args) {
		
		int ar[] = {1, 1, 2, 3, 4, 1, 1, 2, 3, 1, 3, 4};
		
		String s = "infoviaan";
		char str[] = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character c : str) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(map);
		
//		Map<Integer, Integer> map = new HashMap<>();
//	
//		for(int a : ar) {
//			map.put(a, map.getOrDefault(a, 0) + 1);
//		}
//		
//		System.out.println(map);
	}
}
