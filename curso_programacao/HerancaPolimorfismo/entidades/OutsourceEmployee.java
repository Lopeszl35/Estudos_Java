package entidades;

public class OutsourceEmployee extends Empregado {

	private Double additionalCharge;
	
	public OutsourceEmployee() {
		
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
}
