package controlVeiculo;

import java.time.LocalDate;

public abstract class Vehicle {
	
	private String model;
	private LocalDate year;
	
	public Vehicle() {
		
	}

	public Vehicle(String model, LocalDate year) {
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getYear() {
		return year;
	}

	public void setYear(LocalDate year) {
		this.year = year;
	}
	
	public abstract double calculatePrice();

	@Override
	public String toString() {
		return "   ***** Lista de Veiculos ***** "
							+ "\nModel : " + model
							+ "\nYear: " + year.getYear();
	}
	
	
	
	

}
