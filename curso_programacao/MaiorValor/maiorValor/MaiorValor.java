package maiorValor;

import java.util.Scanner;

import controlValor.ControlValor;
import valor.Valor;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos números ira informar?: ");
		int quantidade = input.nextInt();
		
		Valor[] valor = new Valor[quantidade];
		
		for(int i = 0; i < valor.length; i++) {
			System.out.println();
			System.out.printf("Informe o %d° valor: ", i+1);
			double numero = input.nextDouble();
			valor[i] = new Valor(numero);
		}
		
		new ControlValor();
		ControlValor controlValor = ControlValor.getMaiorValor(valor);
		
		System.out.println("Maior valor: " + controlValor.getValor());
		System.out.println("Posição maior valor: " + controlValor.getPosicao());
		
		
		input.close();
	}

}
