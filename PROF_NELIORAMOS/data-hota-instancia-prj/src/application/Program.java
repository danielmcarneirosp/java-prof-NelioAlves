package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2026-03-05");
		LocalDateTime d05 = LocalDateTime.parse("2026-03-05T23:43:48");
		Instant d06 = Instant.parse("2026-03-05T23:43:48Z");
		Instant d07 = Instant.parse("2026-03-05T23:43:48-03:00");
		LocalDate d08 = LocalDate.parse("05/03/2026",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("06/03/2026 00:05",fmt2);
		LocalDate d10 = LocalDate.of(2026, 3, 6);
		LocalDateTime d11 = LocalDateTime.of(2026, 3, 6, 0, 14);
		
		
		System.out.println("LocalDate d01                   = " + d01.toString());
		System.out.println("LocaDateTime d02                = " + d02.toString());
		System.out.println("Instant d03                     = " + d03.toString());
		System.out.println("LocalDate.parse d04             = " + d04.toString());
		System.out.println("LocaDateTime.parse d05          = " + d05.toString());
		System.out.println("Instant.parse d06               = " + d06.toString());
		System.out.println("Instant.parse d07 Local         = " + d07.toString());
		System.out.println("LocalDate.parse d08 Customizado = " + d08.toString());
		System.out.println("LocalDate.parse d09 Customizado = " + d09.toString());
		System.out.println("LocalDate.of d10 Customizado    = " + d10.toString());
		System.out.println("LocalDateTime.of d11 Customizado= " + d11.toString());
		
		

	}

}
