package dadosQuartos;

import java.util.Scanner;

import controlQuartos.ControlQuartos;

public class DadosQuartos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ControlQuartos[] quartos = new ControlQuartos[9];
		
		System.out.println("quantos quartos irão ser alugados?: ");
		int alugados = input.nextInt();
		
		for(int i = 0; i < alugados; i++) {
			input.nextLine();
			System.out.printf("Aluguer %d°\n", i+1);
			System.out.println("Nome: " );
			String nome = input.nextLine();
			
			System.out.println("Email: ");
			String email = input.nextLine();
			
			System.out.println("Quarto para alugar: ");
			int quarto = input.nextInt();
			
			quartos[quarto] = new ControlQuartos(nome, email, quarto);
		}
		
		ControlQuartos control = new ControlQuartos();
		control.getQuartosAlugados(quartos);

		
		input.close();
	}

}
