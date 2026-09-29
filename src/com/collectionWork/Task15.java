package com.collectionWork;

import java.util.Arrays;

public class Task15 {
	public static void main(String[] args) {
		
		int ar[] = {11, 2, 3, 1, 2,9, 10};
		//			i  j
		//     [1, 2, 2, 3, 9, 10, 11]
		
		System.out.println(Arrays.toString(ar));
	
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[i]; 
					ar[i] = ar[j] ;
					ar[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ar));
		
	}
}
