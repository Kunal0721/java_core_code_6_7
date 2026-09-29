package arrayWork;

public class Task1 {
	public static void main(String[] args) {
		
		// sum of all the element in a 2D array. 
		// add two matrix . 
		// subtract two matrix. 
		// multiplication of two matrix. 
		// sum only the diagonal elements in array. 
		// sum only the columns data. 
		
		int ar[][] = {
				{1, 3}, 
				{5, 11, 19, 21}, 
				{61, 19, 210}, 
				{121}
		};
		
//		System.out.println(ar[2][2]);
		for(int i=0; i<4; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
