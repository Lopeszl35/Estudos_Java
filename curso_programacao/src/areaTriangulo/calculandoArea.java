package areaTriangulo;
import java.util.Scanner;

import entidade.Triangulo;

public class calculandoArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		double a = 0, b = 0, c = 0;
		
			System.out.println("Entre com as medidas do triangulo X: ");
			System.out.println("Lado A: ");
			a = input.nextDouble();
			x.setA(a);
			System.out.println("Lado B: ");
			b = input.nextDouble();
			x.setB(b);
			System.out.println("Lado C: ");
			c = input.nextDouble();
			x.setC(c);
			
			while(x.getA() <= 0) {
				System.out.println("Informe um maior que zero para o lado 'A' do triangulo: ");
				a = input.nextDouble();
				x.setA(a);
			}
			
			while(x.getB() <= 0) {
				System.out.println("Informe um maior que zero para o lado 'B' do triangulo: ");
				b = input.nextDouble();
				x.setB(b);
			}
			
			while(x.getC() <= 0) {
				System.out.println("Informe um maior que zero para o lado 'C' do triangulo: ");
				c = input.nextDouble();
				x.setC(c);
			}
			
			System.out.println("Entre com as medidas do triangulo Y: ");
			System.out.println("Lado A: ");
			a = input.nextDouble();
			y.setA(a);
			System.out.println("Lado B: ");
			b = input.nextDouble();
			y.setB(b);
			System.out.println("Lado C: ");
			c = input.nextDouble();
			y.setC(c);
			
			while(y.getA() <= 0) {
				System.out.println("Informe um maior que zero para o lado 'A' do triangulo: ");
				a = input.nextDouble();
				y.setA(a);
			}
			
			while(y.getB() <= 0) {
				System.out.println("Informe um maior que zero para o lado 'B' do triangulo: ");
				b = input.nextDouble();
				y.setB(b);
			}
			
			while(y.getC() <= 0) {
				System.out.println("Informe um maior que zero para o lado 'C' do triangulo: ");
				c = input.nextDouble();
				y.setC(c);
			}
			
			System.out.printf("Aréa do trinauglo 'X': %.4f%n", x.getArea());
			System.out.printf("Aréa do trinauglo 'Y': %.4f%n", y.getArea());
			
			if(x.getArea() > y.getArea()) {
				System.out.println("A areá do triangulo X é maior que a aréa do triangulo Y");
			}else {
				System.out.println("A areá do triangulo Y é maior que a aréa do triangulo X");
			}
		
		input.close();
	}

}
