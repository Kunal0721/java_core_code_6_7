package simple;

public class Task8 {
	public static void main(String[] args) {
		char ch = 'V';
		
		if(ch == 'a' || ch == 'e' || ch =='i'|| ch =='o' || ch == 'u') {
			System.out.println("Vowels");
		}
		else {
			System.out.println("Consonents");
		}
		
		if(ch >= 'a' && ch <='z'	) {
			System.out.println("Small alphabet charater : "  + ch);
		}
		else {
			System.out.println("Capital Alphabet character : " + ch);
		}
	}
}
