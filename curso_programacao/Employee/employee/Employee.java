package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import controlEmployee.ControlEmployee;

public final class Employee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//Criando uma lista de funcionários
		List<ControlEmployee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered: ");
		int N = input.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println(  );
			System.out.println("Employee #"+(i+1) + ": ");
			System.out.print("ID: ");
			Integer id = input.nextInt();
			ControlEmployee idemployee = new ControlEmployee();
			while(idemployee.hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = input.nextInt();
			}
			System.out.println("Name: ");
			input.nextLine();//Limpando o buffer do teclado
			String name = input.nextLine();
			System.out.println("Salary: ");
			Double salary = input.nextDouble();
			
			ControlEmployee employee = new ControlEmployee(id, name, salary);
			
			
			list.add(employee);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = input.nextInt();
		ControlEmployee position = new ControlEmployee();
		Integer pos = position.positionID(list, idsalary);
		
		if(pos == null) {
			System.out.print("This ID dois not exist");
		}
		else{
			System.out.println("Enter the percentage: ");
			double percent = input.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("list of employees: ");
		for (ControlEmployee employee: list) {
			System.out.println(employee);
		}
		
		
		
		
		input.close();
	}

}
