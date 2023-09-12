package time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Time {

	public static void main(String[] args) {
		
		//Instanciando objeto com a data de agora
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		System.out.println();
		
		//Instanciando objeto com data e tempo atual
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		System.out.println();
		
		//Instanciando data e hora atual com fuso horário de  Londres GMT+3
		Instant d03 = Instant.now();
		System.out.println(d03);
		System.out.println();
		
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04);
		System.out.println();
		
		
		Instant d05 = Instant.parse("2022-08-20T01:30:26-03:00");
		System.out.println(d05);
		System.out.println();
		
	}

}
