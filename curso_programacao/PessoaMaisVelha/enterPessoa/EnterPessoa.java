package enterPessoa;

import java.util.Scanner;

import controlPessoa.ControlPessoa;

public class EnterPessoa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar?: ");
		int tamanho = input.nextInt();
		
		int[] idade = new int[tamanho];
		String[] nome = new String[tamanho];
		ControlPessoa[] pessoa = new ControlPessoa[tamanho];
		
		input.nextLine();
		
		for(int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %d° pessoa%n", i+1);
			System.out.println("Nome: ");
			nome[i] = input.nextLine();
			
			System.out.println("Idade: ");
			idade[i] = input.nextInt();
			input.nextLine();
			
			pessoa[i] = new ControlPessoa(nome[i], idade[i]);
		}
		ControlPessoa control = new ControlPessoa();
		
		System.out.printf("Pessoa mais velha: %s", control.pessoaVelha(pessoa));

		
		input.close();
	}

}
