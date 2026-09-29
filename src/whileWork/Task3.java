package whileWork;

public class Task3 {
	public static void main(String[] args) {
		int n = 312;
		int rev = 0, rem = 0;
		int temp = n;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}  // reverse , rev = 321 
	
		System.out.println("============="+temp+"==================");
		while (rev != 0) {
			int r = rev % 10;
			switch (r) {
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("Six");
				break;
			case 7:
				System.out.print("Seven");
				break;
			case 8:
				System.out.print("Eight");
				break;
			case 9:
				System.out.print("Nine");
				break;
			case 0:
				System.out.print("Zero");
				break;
			}
			
			rev /= 10;
		}
		System.out.println();

	}
}