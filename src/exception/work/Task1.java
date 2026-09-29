package exception.work;

public class Task1 {
	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			System.out.println(a / b);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			for (int i = 1; i <= 10; i++) {
				System.out.println("other work..");
			}
		}
	}
}
