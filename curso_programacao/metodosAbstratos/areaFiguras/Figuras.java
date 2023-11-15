package areaFiguras;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import formas.Circle;
import formas.Color;
import formas.Rectangle;
import formas.Shape;

public class Figuras {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();//Criando lista do tipo genêrico da calsse abstrata

		System.out.print("Ente the number of shapes: ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + "data: ");
			
			System.out.println("Rectangle or Circle(r/c)");
			char resp = input.next().charAt(0);
			
			System.out.println("Color: BLACK/BLUE/RED: ");
			Color color = Color.valueOf(input.next().toUpperCase());
			
			if(resp == 'r') {
				System.out.print("Width: ");
				double width = input.nextDouble();
				System.out.print("height: ");
				double height = input.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else if(resp == 'c') {
				System.out.println("Radius: ");
				double radius = input.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		input.close();
	}

}
