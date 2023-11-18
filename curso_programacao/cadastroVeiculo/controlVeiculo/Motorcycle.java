package controlVeiculo;

import java.time.LocalDate;

public class Motorcycle extends Vehicle {
	private Boolean hasSideCar;
	
	public Motorcycle() {
		super();
	}

	public Motorcycle(String model, LocalDate year, Boolean hasSideCar) {
		super(model, year);
		this.hasSideCar = hasSideCar;
	}

	public Boolean getHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(Boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	
	@Override
	public double calculatePrice() {
		if(getHasSideCar() == true && getYear().getYear() >= 1999 && getYear().getYear() <= 2010) {
			return 15000;
		}
		
		if(getHasSideCar() == true && getYear().getYear() >= 2010 && getYear().getYear() <= 2023) {
			return 25000;
		}
		
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nSideCar: " + (getHasSideCar() ? "Sim" : "Não") +
				"\nPrice: $" + String.format("%.2f", calculatePrice()) + "\n";
				
	}

}
