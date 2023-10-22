package matrix2;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o número de linhas para a matrix: ");
		int linhas = input.nextInt();
		System.out.println("Informe o número de colunhas para a matrix: ");
		int colunas = input.nextInt();
		
		int[][] matrix = new int[linhas][colunas];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.println("Informe o número para coluna "+"["+i+"]" + " linha "+"["+j+"]");
				matrix[i][j] = input.nextInt();
			}
		}
		
		 boolean containsNumber = false;
		System.out.println("Informe um número de referência que esteja na matrix: ");
		int numberUser = input.nextInt();
		
		/*Verifica se o número informado está presente na matrix
		 E conta quantas vezes o número se repete
		*/
		while(!containsNumber){
			System.out.println("Informe um número de referência que esteja na matrix: ");
			int targetNumber = input.nextInt();
			
			containsNumber = Arrays.stream(matrix)
	                .flatMapToInt(Arrays::stream)
	                .anyMatch(number -> number == targetNumber);
			
			if(!containsNumber) {
                System.out.println("O número informado não está na matriz. Tente novamente.");
                System.out.println();
            }
		}
		
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j< matrix[i].length; j++) {
					if(matrix[i][j] == numberUser) {
						System.out.println("Posição "+ i +"," + j);
						//verificando se existe número a esquerda
						if(j > 0) {
							System.out.println("Número á esquerda: "+ matrix[i][j-1]);
						}
						
						if(i > 0) {
							System.out.println("Número á acima: "+ matrix[i-1][j]);
						}
						
						if(j > matrix[i].length-1) {
							System.out.println("Número á direita: "+ matrix[i][j+1]);
						}
						
						if(i > matrix[i].length-1) {
							System.out.println("Número á baixo: "+ matrix[i+1][j]);
						}
					}
				}
			}
			
		input.close();
	}

}
