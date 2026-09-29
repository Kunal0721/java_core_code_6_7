package oop.interfaceWork;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		
		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		for(int a : ar) {
//			if(a % 2 == 0) {
//				System.out.print(a  + " ");
//			}
//		}
//		System.out.println();
		
		Arrays.stream(ar).filter(a -> a > 5).forEach(a -> System.out.println(a));
	}
}
