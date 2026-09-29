package whileWork;

public class Task2 {
	public static void main(String[] args) {
		int n = 1331;
		int rev = 0, rem = 0;
		int temp = n;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}

		System.out.println(rev);

		System.out.println(temp == rev ? "Palindrome : " + temp : "not palindrome : " + temp);
	}
}
