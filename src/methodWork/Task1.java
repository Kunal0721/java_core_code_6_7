package methodWork;

public class Task1 {
	
	public static void checkPrime(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) System.out.println("Prime number : " +n) ;
	}
	
	public static void printPrimeNumber(int end) {
		for(int i=1; i<=end; i++) {
			checkPrime(i);
		}
	}
	
//	2 ^ 5  => 2 * 2 * 2 * 2 * 2
	public static void power(int a, int b) {
		int result = 1;
		for(int i=1; i<=b; i++) {
			result *= a;
		}
		System.out.println("result : "  + result) ;
	}
	
	public static void main(String[] args) {
		
		printPrimeNumber(100);
		System.out.println("===========================");
		printPrimeNumber(200);
		System.out.println("==============================");
		
		power(5, 5);
		// questions : 
		// 		1. check the student is passed or not. 
		// 		2. check the number is prime or not. 
		// 		3. print a prime number from 1 to 100. 
		// 		4. create a power function to find the power value without math library. 
		
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

}
