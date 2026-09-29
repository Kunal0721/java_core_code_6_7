package simple;

public class Task7 {
	public static void main(String[] args) {

		int a1 = 140, a2 = 45, a3 = 35;

		if ((a1 + a2 + a3) == 180) {
			System.out.println("==============Triangle-========================");
			if (a1 == a2 && a2 == a3) {
				System.out.println("Equilateral triangle");
			} else {
				if (a1 == a2 || a2 == a3 || a1 == a3) {
					System.out.println("Isocelese triangle");
				} else {
					System.out.println("Scalene triangle");
				}
			}
		} else {
			System.out.println("It is not a triangle");
		}
	}
}
