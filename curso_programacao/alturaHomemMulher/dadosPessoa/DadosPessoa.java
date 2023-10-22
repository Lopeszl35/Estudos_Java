package dadosPessoa;

import java.util.Scanner;

import pessoa.PessoaControl;

public class DadosPessoa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?: ");
		int tamanho = input.nextInt();
		
		PessoaControl[] pessoa = new PessoaControl[tamanho];
		
		for(int i = 0; i < pessoa.length; i++) {
			System.out.printf("Altura da %d° pessoa: ", i+1);
			double altura = input.nextDouble();
			
			input.nextLine();
			System.out.println("Informe o genêro F/M: ");
			String genero = input.nextLine();
			
			pessoa[i] = new PessoaControl(altura, genero);
		}

		PessoaControl control = new PessoaControl();
		
		control.getAlturas(pessoa);
		
		input.close();
	}

}
