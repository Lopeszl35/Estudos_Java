package numbers;

import java.util.Scanner;

import controlNumbers.ControlNumbers;

public class Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos números ira digitar?: ");
		int quantidade = input.nextInt();
		ControlNumbers[] control = new ControlNumbers[quantidade];
		
		for(int i = 0; i < control.length; i++) {
			System.out.printf("Informe o %d° número: ", i+1);
			int numero = input.nextInt();
			//O array da classe na posição 'i' recebe número
			control[i] = new ControlNumbers(numero);
		}
		
		System.out.println();
		for(int i = 0; i < control.length; i++) {
			//Passa o número para o método chamando método getNumero
			control[i].isNegative(control[i].getNumero());
		}
		
		
		

		input.close();
	}

}
