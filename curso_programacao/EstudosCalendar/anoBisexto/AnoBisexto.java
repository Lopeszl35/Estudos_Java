package anoBisexto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AnoBisexto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a data para confirmar se é um ano bisexto");
		System.out.println("Informe neste formata: (dd/mm/yyyy): ");
		String dataDigita = input.nextLine();
		DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate data = LocalDate.parse(dataDigita, formatter);
		
		ControlBisexto controlBisexto = new ControlBisexto();
		
		if(controlBisexto.getAnoBisexto(data)) {
			System.out.println(data.getYear() + " é um ano bisexto");
		} else {
			System.out.println(data.getYear() + " não é um ano bisexto");
		}
		
		
		
		input.close();
	}

}
