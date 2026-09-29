package simple;

public class Task10 {
//	
//	static {
//		for(int i=1; i<=10 ; i++) {
//			System.out.println(i);
//		}
//	}
	
	public static void main(String[] args) {

//		for(int i=1; i<=10; i++) {
//			System.out.println("Hello world : " +  i);
//		}

//		for(int i=1; i<=5; System.out.println(i)) {
//			i++;
//		}

//		for(int i=1;;) {
//			System.out.println(i);
//		}

//		for(;;) {
//			System.out.println("Hello");
//		}

//		int i;
//		for (i = 1; i <= 10; i++)
//			;
//		{
//			System.out.println(i);
//		}

//		for(char i='a'; i<='z'; i++) {
//			System.out.println(i);
//		}
		
//		for(int i=65; i<=92; i++) {
//			System.out.println((char)(i));
//		}
		
//		for(int i=0; i<=127; i++) {
//			System.out.println((char)(i)  + " -> "  + i);
//		}

		for(double i=0; i<=1; i+=0.01) {
			System.out.println(i);
		}
		
//		for (int i = 1, j = 1; i <= 5 || j <= 10; i++, j++) {
//			System.out.println(i + "  " + j);
//		}
		
		
		// i=1, j=1 => 1 <= 5 && 1 <= 10 => 1 1, i=2, j=2 
		// 2 <= 5 && 2 <= 10  =>  2 2 , i=3, j=3 
		// 3 <= 5 && 3 <= 10  =>  3 3 , i=4, j=4 
		// 4 <= 5 && 4 <= 10 =>  4 4 , i=5, j=5
		// 5 <= 5 || 5 <= 10 => 5 5 , i= 6, j=6 
		// 6 <= 5 || 6 <= 10 => 6 6 , i=7, j=7

		// i = 1, 1 <= 5 , i++ -> i = 2 -> sysout(2) : 2
		// i = 2 , 2 <= 5, i++ -> i= 3 -> 3
		// i = 3, 3<= 5, i++ => i = 4 -> 4
		// i= 4, 4 <= 5, i++ => i = 5 -> 5
		// i = 5, 5 <= 5, i++ => i = 6 -> 6
		// i = 6, 6 <= 5------------------------

//		i = 1, 1 <= 5 -> Hello world : 1 , i++  => i = 2
//	    i = 2 , 2 <= 5 -> Hello world : 2, i++ 
//		i = 3 , 3 <= 5 -> Hello world : 3 

		// 1 to 100 -> print the number
		// 100 to 1 -> print the number

	}
}
