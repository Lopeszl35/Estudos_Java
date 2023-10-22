package diferencaHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiferencaHora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Recebendo a data do usuário
		System.out.println("Forneça duas data para calcular a diferença: ");
		ControlDiferenca controlHora = new ControlDiferenca();
		
		for(int i = 0; i < 2; i++) {
			boolean dataValida = false;
			while(!dataValida) {
			System.out.println("Escreva a data no formato dd/mm/yyyy");
			System.out.println((i + 1) + "° Data");
			String dataDigitada = input.nextLine();
			
	        // Defina o formato esperado da data
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
			
			//Validando se a data está no formato correto
				try {
					LocalDate data = LocalDate.parse(dataDigitada, formatter);
					dataValida = true;
					controlHora.addData(data);
				} catch(Exception e) {
					System.out.println("Data informada no formato errado\n Formato correto dd/mm/yyyy");
				}
			}
		}
		
		System.out.println("A diferenças entre os dias é " + controlHora.getDiferenca() + " dias");
		
		
		
		input.close();
	}

}
