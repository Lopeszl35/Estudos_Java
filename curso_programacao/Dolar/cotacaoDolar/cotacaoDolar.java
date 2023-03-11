package cotacaoDolar;

import java.util.Scanner;

import convertDolar.convertDolar;

public class cotacaoDolar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a cotação do dolar: ");
		double cotacao = input.nextDouble();
		System.out.println("Quantos dolares você pretende comprar?: ");
		double valor = input.nextDouble();

		System.out.println("Você ira pagar em reais o preço de: " + convertDolar.dolar(cotacao, valor));

		input.close();
	}

}
