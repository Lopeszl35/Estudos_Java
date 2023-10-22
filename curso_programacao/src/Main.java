import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		Calculo numeros = new Calculo();
		
		System.out.print("Informe um valor para 'a': ");
		num1 = teclado.nextInt();
		numeros.setNum1(num1);
		
		System.out.print("Informe um valor para 'b': ");
		num2 = teclado.nextInt();
		numeros.setNum2(num2);
		
		System.out.printf("A soma de %d + %d = %d", num1, num2, numeros.getCalculo(num1, num2));
		
		
		teclado.close();
	}

}
