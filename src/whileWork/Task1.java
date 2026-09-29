package whileWork;

public class Task1 {
	public static void main(String[] args) {	
		int n = 451;
		int rev = 0, rem = 0;
		while(n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		
		System.out.println(rev);
		
		// n = 451, rev = 0, rem = 0, 
		// n != 0 > 451 != 0 , rem = 451 % 10 -> rem = 1 
		// rev  = 0 * 10 + 1 => rev = 1 
		// n = 451 / 10 -> n = 45 
		
		// n = 45, rev = 1, rem = 45 % 10 -> rem = 5 
		// rev = 1 * 10 + 5 -> rev = 15 
		// n = 45 / 10 -> n = 4 
		
		// n = 4 , rev = 15 , rem = 4 % 10 -> rem = 4 
		// rev = 15 * 10 + 4 -> rev = 154 
		// n = 4 / 10 -> n = 0 
		
		// 0 != 0 ----------------------------------------------
		// rev = 154 
	}
}
