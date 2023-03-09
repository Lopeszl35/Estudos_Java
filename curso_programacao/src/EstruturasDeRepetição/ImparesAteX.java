package EstruturasDeRepetição;
import java.util.Scanner;

public class ImparesAteX {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int u_Numero;
		
		System.out.println("Contar números impares até que número?: ");
		u_Numero = input.nextInt();
		
		System.out.println("Números impares de 0 até " + u_Numero);
		
		for(int i = 0; i < u_Numero; i++) {
			if(i % 2 != 0) {
				System.out.println("impar: " + i);
			}
		}
		
		input.close();
	}

}
