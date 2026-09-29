package oopAbstraction;

interface Enjoy {
	String name = "raj";
	public void fun();
	
	public void engineName();
}

class Simple2 implements Enjoy {

	@Override
	public void fun() {
		System.out.println("Enjoy the holidays..");
	}

	@Override
	public void engineName() {
		System.out.println("This is a simpel method");
	}

}

public class Task2 {
	public static void main(String[] args) {
		Enjoy e = new Simple2();
		e.fun();
	}
}
