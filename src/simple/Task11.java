package simple;

public class Task11 {
	public static void main(String[] args) {
		String s = "Hello 89 18 simple 21 this is because 12 is 2";
		String str[] = s.split(" ");
		// {"hello", "89", "18"...}
		for(String g : str) System.out.print( g + " ");
		
		int sum = 0;
		for(String k : str) {
			if(k.matches("\\d") || k.matches("\\d{2}")) {
				sum += Integer.parseInt(k);  //(int) 89 + 18 + 21 + 12 + 2
				System.out.println(k);
			}
		}
		System.out.println("Total sum : " + sum);
		
		
		// xyz -> zxy, zyx, xyz, xzy
	}
}
