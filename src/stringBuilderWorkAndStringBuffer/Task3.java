package stringBuilderWorkAndStringBuffer;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task3 {
	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		System.out.println("=============================");

		LocalTime t = LocalTime.of(10, 18);
		t = t.plusHours(2);
		System.out.println(t);

		System.out.println("===================================");

		LocalDateTime u = LocalDateTime.of(2026, 7, 29, 18, 8);
		System.out.println(u);
		
		System.out.println("===========================================");
		// h.w. -> Period, Duration, Instant, SimpleDateFormat
		
		
	}
}
