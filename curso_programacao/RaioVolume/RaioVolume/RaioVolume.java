package RaioVolume;
import java.util.Scanner;

import util.Calculator;

public class RaioVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.print("Entre com o valor do raio: ");
		double raio = input.nextDouble();
		
		double c = calculator.circunferencia(raio);
		
		double v = calculator.volume(raio);
		
		System.out.printf("Cincunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi: %.2f%n", calculator.PI);
		
		
		input.close();
	}
	

}
