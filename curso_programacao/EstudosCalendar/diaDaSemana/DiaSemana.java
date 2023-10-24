package diaDaSemana;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Receba a data do usuário no formato "dd/MM/yyyy"
        System.out.println("Forneça uma data (dd/MM/yyyy): ");
        String dataDigitada = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataDigitada, formatter);

        // Use um DateTimeFormatter personalizado para exibir o dia da semana em português
        DateTimeFormatter formatterPortugues = DateTimeFormatter.ofPattern("EEEE", new Locale("pt", "BR"));
        String diaDaSemanaEmPortugues = data.format(formatterPortugues);

        System.out.println("A data " + data + " cai em uma " + diaDaSemanaEmPortugues);
        
        input.close();
    }
}

