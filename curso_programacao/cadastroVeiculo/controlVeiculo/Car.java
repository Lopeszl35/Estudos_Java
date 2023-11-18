package controlVeiculo;

import java.time.LocalDate;

public class Car extends Vehicle {
	private Integer numDoors;
	
	public Car() {
		super();
	}

	public Car(String model, LocalDate year, Integer numDoors) {
		super(model, year);
		this.numDoors = numDoors;
	}

	public Integer getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(Integer numDoors) {
		this.numDoors = numDoors;
	}
	
	@Override
	public double calculatePrice() {
		if(getYear().getYear() >= 1999 && getYear().getYear() <= 2010) {
			return 20000 + (getNumDoors() * 1000);
		}
		
		else if(getYear().getYear() >= 2010 && getYear().getYear() <= 2023) {
			return 40000 + (getNumDoors() * 1000);
		}
		
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nNumber of Doors: " + getNumDoors() +
				"\nPrice: $" + String.format("%.2f", calculatePrice()) + "\n";
				
	}

}
