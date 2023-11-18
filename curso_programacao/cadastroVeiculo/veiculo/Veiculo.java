package veiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controlVeiculo.Car;
import controlVeiculo.Motorcycle;
import controlVeiculo.Vehicle;

public class Veiculo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehicle> list = new ArrayList<>();

        System.out.println("Quantos veículos serão informados: ");
        int numVeic = input.nextInt();

        for (int i = 0; i < numVeic; i++) {
        	System.out.println();
            input.nextLine(); // Limpar o buffer
            System.out.println("Informe o modelo do " + (i+1) + "° veículo: ");
            String model = input.nextLine();

            System.out.println("Informe o ano:");
            int year = input.nextInt();
            // Tenta criar uma instância de LocalDate com o ano fornecido
            LocalDate data = LocalDate.of(year, 1, 1);
            
            System.out.println("Carro ou Moto (c/m): ");
            char carMot = input.next().charAt(0);
            
            if(carMot == 'c') {
            	System.out.println("Quantas portas tem o veiculo?");
            	System.out.print("Portas: ");
            	int doors = input.nextInt();
            	list.add(new Car(model, data, doors));
            }
            
            else if(carMot == 'm') {
            	System.out.println("Possui SideCar? (s/n): ");
            	char hassideCar = input.next().charAt(0);
            	boolean sideCar = false;
            	if(hassideCar == 's') {
            		sideCar = true;
            	} else {
            		sideCar = false;
            	}
            	
            	list.add(new Motorcycle(model, data, sideCar));
            }
          
        }
        
        for(Vehicle vehicle : list) {
        	System.out.println(vehicle.toString());
        }
            
            input.close();
   }
}

        

    
