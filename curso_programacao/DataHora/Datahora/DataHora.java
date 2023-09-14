package Datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now(); //Imprime a data
		LocalDateTime d02 = LocalDateTime.now(); //Imprimi a hora
		Instant d03 = Instant.now(); //Data hora global com fuso horario
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		LocalDate d06 = LocalDate.parse("20/07/2022", fmt1); //fmt1 passa o formato da data
		
		LocalDate d07 = LocalDate.of(2022, 7, 22); //Imprimindo ano, mes e data separadamente
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);


		


	}

}
