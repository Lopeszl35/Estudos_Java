package programaPrincipal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import control.ImportedProduct;
import control.Product;
import control.UsedProduct;

public class Produtos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n_products = input.nextInt();
		
		for(int i = 1; i <= n_products; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i): ");
			char typeProduct = input.next().charAt(0);
			
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.print("Price: ");
			double price = input.nextDouble();
			
			if(typeProduct == 'c') {
				list.add(new Product(name, price));
			}
			
			else if(typeProduct == 'i') {
				System.out.print("Customs fee: ");
				double customsfee = input.nextDouble();
				list.add(new ImportedProduct(name, price, customsfee));
			}
			
			else if(typeProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY)");
				LocalDate date = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
				
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product produto : list) {
			System.out.println(produto.priceTag());
		}
		
		
		input.close();
	}

}
