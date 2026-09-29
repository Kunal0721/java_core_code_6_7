package com.threadingWork;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("Raju");
		System.out.println(Thread.currentThread());
		
		Thread.sleep(1000);
		System.out.println("Hello world");
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello : "  + i);
			Thread.sleep(1000);
		}
	}
}
