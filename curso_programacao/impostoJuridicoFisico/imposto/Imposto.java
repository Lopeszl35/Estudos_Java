package imposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import controlImposto.TaxPayer;
import controlImposto.Individual;
import controlImposto.Company;

public class Imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int nPayers = input.nextInt();
		
		for(int i = 1; i <= nPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char typeImpost = input.next().charAt(0);
			
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			
			System.out.print("Anual Income: ");
			double anualIncome = input.nextDouble();
			
			if(typeImpost == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpend = input.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpend));
			}
			
			else if(typeImpost == 'c') {
				System.out.print("Number of employees: ");
				int employees = input.nextInt();
				
				list.add(new Company(name, anualIncome, employees));
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		
		for(TaxPayer tax : list) {
			double taxes = tax.tax();
			System.out.println(tax.getName() + ": $" + String.format("%.2f", tax.tax()));
			totalTaxes =+ taxes;
		}
		System.out.println();
		
		
		System.out.print("TOTAL TAXES: ");
		System.out.print(String.format("%.2f", totalTaxes));
		
		
		
		input.close();
	}

}
