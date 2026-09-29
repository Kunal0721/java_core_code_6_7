package oopAbstraction;

public class Task1 {
	public static void main(String[] args) {

		Simple s = new SimpleImpl();
		s.hello();
		
		Engine e = new PetrolEngine();
		e.engine();
		e.engineName();
	}
}
