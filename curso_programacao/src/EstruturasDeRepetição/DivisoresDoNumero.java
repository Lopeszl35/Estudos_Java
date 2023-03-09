package EstruturasDeRepetição;
import java.util.Scanner;

public class DivisoresDoNumero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um número para encontrar seus divisores: ");
		num = input.nextInt();
		
		System.out.println("divisores do número: " + num);
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println("Divisor: " + i);
			}
		}
		
		input.close();
		
	}

}
