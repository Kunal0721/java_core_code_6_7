package simple;

public class Task4 {
	public static void main(String[] args) {
		int a = 1, b = 4, c = 2;
		System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
		double desc = b * b - 4*a*c;
		if(desc >= 0) {
			double xpos = (-b  + Math.sqrt(desc)) / (2*a);
			double xneg = (-b  - Math.sqrt(desc)) / (2*a);
			System.out.println("x + : " + xpos);
			System.out.println("x - : " + xneg);
		}
		else {
			System.out.println("Imaginary roots+");
		}
	}
}
