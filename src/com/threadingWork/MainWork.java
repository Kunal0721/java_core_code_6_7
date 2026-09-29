package com.threadingWork;

class File1 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("File 1 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class File2 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("File 2 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class MainWork {
	public static void main(String[] args) {
		File1 f1 = new File1();
		File2 f2 = new File2();
		
		f1.start();
		f2.start();
	}
}
