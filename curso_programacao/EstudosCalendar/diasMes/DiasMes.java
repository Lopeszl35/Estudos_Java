package diasMes;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DiasMes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Forneça a data para saber quantos dias tem o mês");
		System.out.println("Informe neste formata (mm/aaaa): ");
		String dataDigitada = input.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
		
		//Parse da data para YearMoth
		YearMonth yearMonth = YearMonth.parse(dataDigitada, formatter);
		
		//Obtenha a quantidade de dias no mes
		int diasNoMes = yearMonth.lengthOfMonth();
		
		//Formate o nome do mês em português
		String mesPortugues = yearMonth.getMonth().getDisplayName(
                java.time.format.TextStyle.FULL, 
                new Locale("pt", "BR")
        );
		
		System.out.println("O mês de " + mesPortugues + " de " + yearMonth.getYear() + " tem " + diasNoMes + " dias");
		
		
		
		input.close();
	}

}
