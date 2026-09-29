package methodWork;

public class Task3 {
	
	public static int hello() {
		return 89;
	}
	
	public static String simple() {
		return "Infoviaan";
	}
	public static void main(String[] args) {
		int a = 90;
		System.out.println(a);
		
		int x = hello(); // hello() = 89
		System.out.println(x);
		
		String s = simple();
		System.out.println(s);
	}
}
