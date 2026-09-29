package stringBuilderWorkAndStringBuffer;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter name : ");
//		String name = sc.next();
//		System.out.println("Welcome : " + name);
//	

		// questions :
		// 1. check the number is even or odd.
		// 2. check the string is palindrome or not.
		// 3. take the 5 values from user and put it into array.
		int ar[] = new int[5];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter the value of index :  " + i);
			ar[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(ar));
		sc.close();

	}
}
