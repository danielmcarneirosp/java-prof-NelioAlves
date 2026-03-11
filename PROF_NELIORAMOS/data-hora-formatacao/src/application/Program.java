package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2026-03-06");
		LocalDateTime d05 = LocalDateTime.parse("2026-03-05T23:43:48");
		Instant d06 = Instant.parse("2026-03-06T01:43:48Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		System.out.println("LocalDate - DateTimeFormatter d04 = " + d04.format(fmt1));
		System.out.println("LocalDate - DateTimeFormatter d04 = " + fmt1.format(d04));
		System.out.println("LocalDate - DateTimeFormatter d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("LocalDateTime - DateTimeFormatter d04 = " + d05.format(fmt1));
		System.out.println("LocalDateTime - DateTimeFormatter d04 = " + d05.format(fmt2));
		System.out.println("Instant - d06 = " + fmt3.format(d06));
		
	}

}
