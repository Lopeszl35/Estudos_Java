package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = input.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = input.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = input.nextLine();
		
		System.out.print("Base Salary: ");
		double baseSalary = input.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int contracts = input.nextInt();
		
		for(int i = 0; i < contracts; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			
			System.out.print("Enter date (DD/MM/YYYY:) ");
			String data1 = input.next();
			
			LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = input.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculete income (MM/YYYY): ");
		
		String monthAndYear = input.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartmen().getName());
		
		
		System.out.println("Encome for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		input.close();

	}

}
