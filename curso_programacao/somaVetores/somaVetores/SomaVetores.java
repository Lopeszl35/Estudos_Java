package somaVetores;

import java.util.Scanner;

import vetores.Vetores;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declarando tamanho dos vetores
		System.out.println("Quantos valores tera cada vetor?: ");
		int tamanho = input.nextInt();
		 int[] vetor1 = new int[tamanho];
		 int[] vetor2 = new int[tamanho];
		
		//Inserindo valores no vetor A
		System.out.println("Digite os valores do vetor 'A'");
		for(int i = 0; i < vetor1.length; i++) {
			System.out.printf("Informe o valor do %d° número: ", i+1);
			int numero = input.nextInt();
			
			vetor1[i] = numero;
		}
		
		//Inserindo valores no vetor B
		System.out.println("Digite os valores do vetor 'B'");
		for(int i = 0; i < vetor2.length; i++) {
			System.out.printf("Informe o valor do %d° número: ", i+1);
			int numero = input.nextInt();
					
			vetor2[i] = numero;
		}
		
		int[] somaVetor = Vetores.getVetor(vetor1, vetor2, tamanho);
		
		System.out.println("Soma dos vetores: ");
		for(int i = 0; i < somaVetor.length; i++) {
			System.out.print(somaVetor[i] + " ");
		}
		
		input.close();
	}

}
