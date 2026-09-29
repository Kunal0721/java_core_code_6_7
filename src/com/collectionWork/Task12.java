package com.collectionWork;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class CochingStudent implements Comparable<CochingStudent> {
	int id;
	String name;

	public CochingStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(CochingStudent o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "CochingStudent [id=" + id + ", name=" + name + "]";
	}

}

public class Task12 {
	public static void main(String[] args) {

		Queue<CochingStudent> q = new PriorityQueue<CochingStudent>();
		q.offer(new CochingStudent(10, "Raj"));
		q.offer(new CochingStudent(2, "Sheetal"));
		q.offer(new CochingStudent(4, "Nikita"));
		q.offer(new CochingStudent(1, "Jayesh"));
		q.offer(new CochingStudent(3, "Balram"));
		q.offer(new CochingStudent(15, "Rohan"));
	
		while(!q.isEmpty()) System.out.println(q.poll());
		
	}
}
