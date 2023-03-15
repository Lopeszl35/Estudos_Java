package vetores;

public class Vetores {
	
	private int numero;

	public Vetores(int numero) {
		this.numero = numero;
	}
	
	public Vetores() {
		
	}

	public int getNumero() {
		return numero;
	}

	public static int[] getVetor(int[] vetor1, int[] vetor2, int tamanho) {
		int[] vetor = new int[tamanho];
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = vetor1[i] + vetor2[i];
		}
		return vetor;
	}
	
}
