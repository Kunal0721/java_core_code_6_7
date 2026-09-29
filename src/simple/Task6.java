package simple;

public class Task6 {
	public static void main(String[] args) {
		double temp = 12.89;

		if (temp >= 30) {
			System.out.println("Hot temperature");
		} else {
			if (temp >= 20 && temp < 30) {
				System.out.println("Room temperature");
			} else {
				System.out.println("Cold temperature");
			}
		}
	}
}
