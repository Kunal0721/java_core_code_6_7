package oop.interfaceWork;

public interface Account {
	
	public void withdrawl();
	public void deposit();
	public void transfer();
}

interface Animal{
	public void eat();
	public void sleep();
	public void leg();
	public void speed();
	public void speak();
	public void tail();
}

interface Fur{
	public void furMethod();
}

interface Fur2{
	public void furMethod();
}


class Dog implements Animal, Fur, Fur2{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void furMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tail() {
		// TODO Auto-generated method stub
		
	}
	
}

class Lion implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tail() {
		// TODO Auto-generated method stub
		
	}
	
}

class Cat implements Animal{

	@Override
	public void eat() {
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tail() {
		// TODO Auto-generated method stub
		
	}
	
}