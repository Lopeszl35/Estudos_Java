package curso_programacao;

import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroPessoas;
		
		System.out.println("Informe a quantidade de pessoas: ");
		numeroPessoas = input.nextInt();
		//Criando um vetor com tamanho informado pelo usuário
		double[] alturaPessoas = new double[numeroPessoas];
		
		for(int i = 0; i < numeroPessoas; i++) {
			System.out.printf("Informe o tamanho da %d° pessoa: ", i+1);
			alturaPessoas[i] = input.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0; i < numeroPessoas; i++) {
			soma += alturaPessoas[i];
		}
		double media = soma / numeroPessoas;
		System.out.println("Média das alturas = " + media);

		input.close();
	}

}
