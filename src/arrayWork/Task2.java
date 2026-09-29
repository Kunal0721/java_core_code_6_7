package arrayWork;

public class Task2 {
	public static void main(String[] args) {
		
		int ar[][][] = {
				{
					{11, 12, 13}, 
					{14, 15, 16}, 
					{17, 18, 19}
				}, 
				{
					{1, 2, 3}, 
					{4, 5, 6}, 
					{7, 8, 9}
				}
		};
		
//		System.out.println(ar[0][0][1]);
//		System.out.println(ar[0][1][1]);
//		System.out.println(ar[1][2][1]);
		for(int f=0; f<2; f++) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					System.out.print(ar[f][i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}