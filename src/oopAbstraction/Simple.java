package oopAbstraction;

public abstract class Simple {

	public abstract void hello();
}

class SimpleImpl extends Simple {

	@Override
	public void hello() {
		System.out.println("There is a simple implementation");
	}

}

abstract class Engine {
	String name = "raj";
	public abstract void engine();

	public void engineName() {
		System.out.println("V8 Engine");
	}
}

class DiselEngine extends Engine {

	@Override
	public void engine() {
		System.out.println("This is a Disel engine");
	}

}

class PetrolEngine extends Engine {

	@Override
	public void engine() {
		System.out.println("This is a petrol engine");
	}

}