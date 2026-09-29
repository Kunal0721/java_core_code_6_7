package com.threadingWork;

public class Task2 {
	public static void main(String[] args) {

		Thread th = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("work :  " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		th.start();
	}
}
