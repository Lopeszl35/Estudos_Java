package EstruturasDeRepetição;
import java.util.Scanner;
import java.lang.Math;

public class QuadradoECubo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num;
		
		do {//Enquano o usuário não informar um valor postivo o programa não ira adiante
			System.out.println("Informe um número positivo: ");
			num = input.nextDouble();
			if(num <= 0) {
				System.out.println("Informe um número maior que '0': ");
				num = input.nextDouble();
			}
		}while(num <= 0);
		
		for(int i = 1; i <= num ; i++) {
				System.out.printf("%d %.0f %.0f", i, Math.pow(i, 2), Math.pow(i, 3));
				System.out.println();
		}

		input.close();
	}

}
