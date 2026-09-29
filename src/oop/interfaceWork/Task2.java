package oop.interfaceWork;

@FunctionalInterface
interface Enjoy {
	public void fun();
}

//class Simple implements Enjoy {
//	@Override
//	public void fun() {
//		System.out.println("Yes we are enjoying the holidays..");
//	}
//}

public class Task2 {
	public static void main(String[] args) {
		Enjoy e = () -> {System.out.println("Hello fun method");};
		e.fun();
	}	
}
