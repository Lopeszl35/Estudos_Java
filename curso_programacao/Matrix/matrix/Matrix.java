package matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro, que sera o tamanho da matrix");
		int n = input.nextInt();
		input.nextLine();
		
		//Criando matrix bidimensional
		int[][] mat = new int[n][n];
		
		//Lendo os valores para a matrix
		for(int i = 0; i < n; i++) {//Primeiro for para as linhas
			for(int j = 0; j < n; j++) {//Segundo for para as colunas
				System.out.println("Informe o valor para a linha "+ "[" + i + "]"  + " coluna " + "[" + j + "]");
				mat[i][j] = input.nextInt();
			}
		}
		
		//Imprimindo números da diagonal
		System.out.println("Main diagonal:");
		for(int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		System.out.println();
		
		//Contando a quantidade de números negativos
		int negative = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					negative++;
				}
			}
		}
		
		System.out.println("A quantidade de números negativos é " + negative);
		
		
		input.close();
	}

}
