package convertDolar;

public class convertDolar {
	
	public static final double IOF = 0.06;
	
	public static double dolar(double cotacao, double valor) {
		return (cotacao * valor) + ((cotacao * valor) * IOF);
	}

}
