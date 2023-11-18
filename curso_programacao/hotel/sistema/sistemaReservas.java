package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controlQuartos.QuartoLuxo;
import controlQuartos.QuartoSimples;

public class sistemaReservas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<QuartoSimples> quartoSimples = new ArrayList<>();
		List<QuartoLuxo> quartoLuxo = new ArrayList<>();

		System.out.println("Sistema da parte do funcionário");
		System.out.println("Quantos quartos serão criados?: ");
		int criacao = input.nextInt();
		
		for(int i = 0; i < criacao; i++) {
			System.out.println("Quarto de Luxo ou Simples? (L/S): ");
			char tipoQuarto = input.next().charAt(0);
			
			System.out.print("Número do quarto: ");
			int numQuarto = input.nextInt();
			
			System.out.print("Preço por noite: ");
			double preco = input.nextInt();
			
			if(tipoQuarto == 's') {
				System.out.println("Criando quarto simples: ");
				System.out.print("Quantas Camas: ");
				int camas = input.nextInt();
				
				System.out.print("Quantos Banheiros: ");
				int banheiro = input.nextInt();
				
				quartoSimples.add(new QuartoSimples(numQuarto, preco, camas, banheiro));
			}
			
			else if(tipoQuarto == 'l') {
				System.out.println("Quantas camas?: ");
				int camas = input.nextInt();
				
				System.out.print("Possui aréa de estar?: (s/n):");
				char respostaAreaEstar = input.next().charAt(0);
			    boolean areaEstar = respostaAreaEstar == 's' || respostaAreaEstar == 'S';
			    
			    System.out.print("Possui vista para o mar?: (s/n):");
				char respostaVistaMar = input.next().charAt(0);
			    boolean vistaMar = respostaVistaMar == 's' || respostaVistaMar == 'S';
			    
			    quartoLuxo.add(new QuartoLuxo(numQuarto, preco, camas, areaEstar, vistaMar));
				
			}
			
		}
		
		
		
		
		
		
		input.close();
	}

}
