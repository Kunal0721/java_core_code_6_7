package whileWork;

public class Task5 {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			// space
			for (int k = 1; k <= n - i; k++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1; i--) {
			// space
			for (int k = 1; k <= n - i; k++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// _ _ _ _ *
		// _ _ _ * *
		// _ _ * * *

		// i = 1, 1 <= 5 :
		// k=1, 1 <= 4, k = 5, 5<=4
		// k=2, 2 <= 4
		// k=3, 3 <= 4
		// k=4, 4 <= 4

	}
}
