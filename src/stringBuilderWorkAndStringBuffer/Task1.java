package stringBuilderWorkAndStringBuffer;

public class Task1 {
	public static void main(String[] args) {
		
		String st = "Hello";
		System.out.println(st);
		st.concat(" world");
		System.out.println(st);
		
		System.out.println("==================================");

		StringBuilder s = new StringBuilder("hello");
		System.out.println(s);
		s.append(" world");
		System.out.println(s);
		
		System.out.println("======================================");
		
		StringBuffer s2 = new StringBuffer("hello");
		System.out.println(s2);
		s2.append(" world");
		System.out.println(s2);
		
	}
}
