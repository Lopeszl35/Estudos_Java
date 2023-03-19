package mediaPar;

import java.util.Scanner;

import controlMedia.ControlMedia;

public class MediaPar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanto elemento terá o vetor?: ");
		int tamanho = input.nextInt();
		
		ControlMedia[] control = new ControlMedia[tamanho];
		
		for(int i = 0; i < control.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			int numero = input.nextInt();
			
			control[i] = new ControlMedia(numero);
		}
		
		ControlMedia media = new ControlMedia();
		media.getMediaPar(control);

		input.close();
	}

}
