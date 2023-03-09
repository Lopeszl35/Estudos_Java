package areaTriangulo;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		double areaX, areaY, pX, pY;
		
			System.out.println("Entre com as medidas do triangulo X: ");
			System.out.println("Lado A: ");
			xA = input.nextDouble();
			System.out.println("Lado B: ");
			xB = input.nextDouble();
			System.out.println("Lado C: ");
			xC = input.nextDouble();
			
			while(xA <= 0) {
				System.out.println("Informe um maior que zero para o lado 'A' do triangulo: ");
				xA = input.nextDouble();
			}
			
			while(xB <= 0) {
				System.out.println("Informe um maior que zero para o lado 'B' do triangulo: ");
				xB = input.nextDouble();
			}
			
			while(xC <= 0) {
				System.out.println("Informe um maior que zero para o lado 'C' do triangulo: ");
				xC = input.nextDouble();
			}
			
			System.out.println("Entre com as medidas do triangulo Y: ");
			System.out.println("Lado A: ");
			yA = input.nextDouble();
			System.out.println("Lado B: ");
			yB = input.nextDouble();
			System.out.println("Lado C: ");
			yC = input.nextDouble();
			
			while(yA <= 0) {
				System.out.println("Informe um maior que zero para o lado 'A' do triangulo: ");
				yA = input.nextDouble();
			}
			
			while(yB <= 0) {
				System.out.println("Informe um maior que zero para o lado 'B' do triangulo: ");
				yB = input.nextDouble();
			}
			
			while(yC <= 0) {
				System.out.println("Informe um maior que zero para o lado 'C' do triangulo: ");
				yC = input.nextDouble();
			}
			
			pX = (xA + xB + xC) / 2;
			pY= (yA + yB + yC) / 2;
			areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX -xC ));
			areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY -yC ));
			
			System.out.printf("Aréa do trinauglo 'X': %.4f%n", areaX);
			System.out.printf("Aréa do trinauglo 'Y': %.4f%n", areaY);
			
			if(areaX > areaY) {
				System.out.println("A areá do triangulo X é maior que a aréa do triangulo Y");
			}else {
				System.out.println("A areá do triangulo Y é maior que a aréa do triangulo X");
			}
		
		input.close();
	}

}
