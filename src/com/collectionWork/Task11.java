package com.collectionWork;

import java.util.LinkedList;
import java.util.Queue;

public class Task11 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("ritik");
		q.offer("rohan");
		q.offer("raj");
		
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.offer("tanishq");
		q.offer("raj");
		System.out.println(q);
		q.offer("rishab");
		
		for(String s : q) System.out.println(s);
		
		System.out.println("Top element : " + q.peek());
	}
}
