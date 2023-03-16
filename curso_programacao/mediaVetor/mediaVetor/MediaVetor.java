package mediaVetor;

import java.util.Scanner;

import vetor.Vetor;

public class MediaVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos elementos tera o vetor?: ");
		int tamanho = input.nextInt();
		double[] vetor = new double[tamanho];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° valor: ", i+1);
			double numero = input.nextDouble();
			
			vetor[i] = numero;
		}
		
		double media = Vetor.getMediaVetor(vetor);
		
		double[] abaixoMedia = Vetor.getAbaixoMedia(vetor, media);
		
		System.out.println("Media: " + media);
		for(int i = 0; i < abaixoMedia.length; i++) {
			System.out.println(" " + abaixoMedia[i]);
		}
		
		input.close();
	}

}
