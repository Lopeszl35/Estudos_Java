package alturaPessoas;

import java.util.Scanner;

import controlPessoas.ControlPessoa;
import pessoa.Pessoa;

public class AlturaPessoa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Quantas pessoas ira informar?: ");
		int quantidade = input.nextInt();
		
		//Cria objeto de array para a classe pessoa
		Pessoa[] pessoa = new Pessoa[quantidade];
		
		for(int i = 0; i < pessoa.length; i++) {
			input.nextLine();
			System.out.printf("Informe o nome da %d° pessoa: ", i+1);
			String nome = input.nextLine();
			
			System.out.printf("Informe a altura da %d° pessoa: ", i+1);
			double altura = input.nextDouble();
			
			System.out.print("Informe a idade da pessoa: ");
			int idade = input.nextInt();
			System.out.println();
			
			//Passa os dados para a classe com o constructor
			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		//objeto da classe ControlPessoa
		ControlPessoa control = new ControlPessoa();
		
		System.out.printf("Média alturas: %.2f%n", control.getMedia(pessoa));
		System.out.printf("Pessoas com menos de 16 anos: %.2f porcento%n", control.getPorcentagem16(pessoa));
		for(int i = 0; i < pessoa.length; i++) {
			System.out.println();
			if(pessoa[i].getIdade() < 16) {
				System.out.printf(" ", pessoa[i].getNome());
			}
		}
		System.out.println();
		
		input.close();
	}

}
