package methodWork;

public class Task4 {
	//	1. no-return and no-parameter 
	public static void menu() {
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for substract");
		System.out.println("Enter 3 for multiply");
	}

	// 2. no-return and parameter
	public static void add(int a, int b) {
		System.out.println("addition : " + (a + b));
	}

	//3. return and no-parameter 
	public static int simple() {
		return 89;
	}

	//4. return and parameter
	public static int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		menu();
		add(6, 8);

		for (int i = 10; i <= simple(); i++) {
			System.out.println(i);
		}
		System.out.println(multiply(7, 10));
	}
}
