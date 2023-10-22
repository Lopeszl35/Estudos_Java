package controlMedia;

public class ControlMedia {
	
	private int numero;

	public ControlMedia(int numero) {
		this.numero = numero;
	}
	
	public ControlMedia() {
		
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void getMediaPar(ControlMedia[] array) {
		double soma = 0, media = 0.0;
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i].getNumero() % 2 == 0) {
				soma += array[i].getNumero();
				count++;
			}
		}
		media = soma / count;
		
		if(media > 0) {
			System.out.println();
			System.out.printf("A média dos pares = %.2f", media);
		}
		else if(count == 0) {
			System.out.println();
			System.out.println("Nenhum número par encontrado");
		}
	}

}
