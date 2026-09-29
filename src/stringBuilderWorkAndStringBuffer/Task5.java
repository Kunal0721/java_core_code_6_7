package stringBuilderWorkAndStringBuffer;

import java.util.Arrays;

//  \\d [0-9]
public class Task5 {
	public static void main(String[] args) {
		String s = "hello 90 this is 15 and you are 1";

		String str[] = s.split(" ");

		System.out.println(Arrays.toString(str));
		System.out.println(str[0]);
		System.out.println("==================================");
		int sum = 0;
		for (String k : str) {	
			if(k.matches("\\d{2}") || k.matches(("\\d"))) {
				sum += Integer.parseInt(k);
				System.out.println(k);
			}
		}
		
		System.out.println("total sum : "  + sum);
	}
}
