package com.aggregation;

class Engine{
	public void startEngine() {
		System.out.println("Engine is started..");
	}
}

class ElectricEngine extends Engine{
	public void startEngine() {
		System.out.println("Electric engine is started..");
	}
}

class DiselEngine extends Engine{
	public void startEngine() {
		System.out.println("Disel engine is started..");
	}
}

class Car{
	String name;
	Engine engine;
	public void startCar() {
		engine.startEngine();
		System.out.println("Car is started..");
	}
}

public class Task1 {
	public static void main(String[] args) {
		Car cr = new Car();
		cr.engine = new DiselEngine();
		cr.startCar();
	}
}
