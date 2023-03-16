package vetor;

public class Vetor {
	private double numero;

	public Vetor(double numero) {
		this.numero = numero;
	}
	
	public Vetor() {
		
	}
	
	public double getNumero() {
		return this.numero;
	}
	
	public static double getMediaVetor(double[] vetor) {
		double media, soma = 0;;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		media = soma / vetor.length;
		
		return media;
	}
	
	public static double[] getAbaixoMedia(double[] vetor, double media) {
	    double[] abaixoMedia = new double[vetor.length];
	    int count = 0;
	    
	    for(int i = 0; i < vetor.length; i++) {
	        if(vetor[i] < media) {
	            abaixoMedia[count] = vetor[i];
	            count++;
	        }
	    }
	    
	    double[] resultado = new double[count];
	    for (int i = 0; i < count; i++) {
	        resultado[i] = abaixoMedia[i];
	    }
	    
	    return resultado;
	}

	
	

}
