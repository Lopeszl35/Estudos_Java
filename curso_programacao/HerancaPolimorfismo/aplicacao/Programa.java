package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;
import entidades.OutsourceEmployee;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n_employees = input.nextInt();
		
		for(int i = 1; i <= n_employees; i++) {
			System.out.println("Employee #" + i + " data");
			
			System.out.print("Outsourced (y/n)? ");
			char outSourced = input.next().charAt(0);
			
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.print("Hours: ");
			int hours = input.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();
			System.out.println();
			
			if( outSourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = input.nextDouble();
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Empregado(name, hours, valuePerHour));
			}
		}
		
		
		System.out.println();
		System.out.println("PAYMENTS");
		
		for(Empregado emp : list) {
			System.out.println(emp.getName() + ": $" + String.format("%.2f", emp.payment()));
		}
		
		input.close();
	}

}
