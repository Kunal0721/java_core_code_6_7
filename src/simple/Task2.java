package simple;

public class Task2 {
	public static void main(String[] args) {
		
		System.out.println(1+2+3+4+5+""); // 15
		System.out.println(1+2+3+4+""+5);  // 105 
		System.out.println(1+2+3+""+4+5);  // 69 645
		System.out.println(1+2+""+3+4+5);  // 312  3345
		System.out.println(1+""+(2+3+4+5));  // 114  12345
		
		// string concatination 
		System.out.println(1+1+""); // 2
		System.out.println(1+""+1); // 11
	}
}
