package simple;

public class Task5 {
	public static void main(String[] args) {
		int rollno = 1019;
		String name = "ritik";
		double hindi = 29.78;
		double english = 10;
		double maths = 18.78;
		
		double total = hindi + english + maths;
		double percentage = total / 3;
		if(percentage >= 33) {
			if(percentage >= 60) {
				System.out.println("=============Passed==================");
				System.out.println("Name : " + name  + ", rollno : "+  rollno);
				System.out.println("first division passed : " + percentage + ", total marks : " + total);
				System.out.println("========================================");
			}
			else {
				System.out.println("=============Passed==================");
				System.out.println("Name : " + name  + ", rollno : "+  rollno);
				System.out.println("passed : " + percentage + ", total marks : " + total);
				System.out.println("========================================");
			}
		}
		else {
			System.out.println("=============Failed==================");
			System.out.println("Name : " + name  + ", rollno : "+  rollno);
			System.out.println("Failed : " + percentage + ", total marks : " + total);
			System.out.println("========================================");
		}
	}
}
