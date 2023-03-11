package AprovacaoAluno;

import java.util.Scanner;
import Estudante.Estudante;

public class AprovacaoAluno {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estudante estudante = new Estudante();
        double[][] notas = new double[3][3];
        String[] nomes = new String[3];

        for(int k = 0; k < 3; k++) {
        	System.out.printf("Informe o nome do %d° Aluno: %n", k+1);
        	String nome = input.nextLine();
        	nomes[k] = nome;
        	
	        for(int i = 0; i < 3; i++) {
	            System.out.printf("Informe a nota do %dº trimestre: %n", i+1);
	            double nota = input.nextDouble();
	            notas[k][i] = nota;
	            //Checando se as notas estão dentro do limite para cada trimestre
	            while(notas[k][0] > 30 || notas[k][0] < 0) {
	            	System.out.println("Informe uma nota entre 0 até 30: ");
	            	nota = input.nextDouble();
	            	notas[k][0] = nota;
	            }
	            
	            while(notas[k][1] > 35 || notas[k][1] < 0) {
	            	System.out.println("Informe uma nota entre 0 até 35: ");
	            	nota = input.nextDouble();
	            	notas[k][1] = nota;
	            }
	            
	            while(notas[k][2] > 35 || notas[k][2] < 0) {
	            	System.out.println("Informe uma nota entre 0 até 35: ");
	            	nota = input.nextDouble();
	            	notas[k][2] = nota;
	            }
	        }
	        input.nextLine();
	        System.out.println();
        }
        
        estudante.setNome(nomes);
        estudante.setNotas(notas);
        estudante.alunoAprovacao(nomes, notas);
        
        
        
      
        input.close();
    }

}
