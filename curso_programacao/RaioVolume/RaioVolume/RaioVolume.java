package RaioVolume;
import java.util.Scanner;

public class RaioVolume {
	//Atribuindo uma constante
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o valor do raio: ");
		double raio = input.nextDouble();
		
		double c = circunferencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("Cincunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi: %.2f%n", PI);
		
		
		input.close();
	}
	
	//Em Java os métodos na propria classe devem ser declarados com "static"
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

}
