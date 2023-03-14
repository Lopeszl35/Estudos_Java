package controlNumbers;

public class ControlNumbers {

	private int numero;
	
	public ControlNumbers(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void isNegative(int numero) {
		if(numero < 0) {
			System.out.printf("O número %d é negativo%n", numero);
		}
	}
}
