package simple;

public class Task9 {
	public static void main(String[] args) {

		System.out.println(Math.sqrt(19));
		System.out.println(Math.pow(12, 5));
		System.out.println(Math.max(18, 9));
		System.out.println(Math.min(19, 8));
		System.out.println(Math.PI);
		System.out.println(Math.TAU);
		System.out.println(Math.random());
		System.out.println((int) (Math.random() * 10000));

		int digit1 = (int) (Math.random() * 10);
		int digit2 = (int) (Math.random() * 10);
		int digit3 = (int) (Math.random() * 10);
		int digit4 = (int) (Math.random() * 10);

		System.out.println("OTP is : " + digit1 + digit2 + digit3 + digit4);
		
		// h.w. -> ladder if-else 
		
	}
}
