package somaMedia;

import java.util.Scanner;

import control.SomaMedia;

public class InputData {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		double media;
		
		System.out.println("Quantos números ira digitar?: ");
		int quantidade = input.nextInt();
		
		SomaMedia[] control = new SomaMedia[quantidade];
		for(int i = 0 ; i < control.length; i++) {
			System.out.printf("Informe o %d° número: ", i+1);
			double numero = input.nextDouble();
			control[i] = new SomaMedia(numero);
		}
		System.out.print("Valores: ");
		for (int i = 0; i < control.length; i++) {
		   soma += control[i].getNumero();
		   System.out.printf(" %.2f", control[i].getNumero() );
		}
		System.out.println();
		media = soma / control.length;
		System.out.printf("Soma: %d%n", soma);
		System.out.printf("Média: %.2f%n", media);
		

		input.close();
	}

}
