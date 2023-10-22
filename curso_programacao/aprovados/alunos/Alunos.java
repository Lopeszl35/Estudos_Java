package alunos;

import java.util.Scanner;

import controlAluno.ControlAluno;

public class Alunos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos alunos seram informados?: ");
		int tamanho = input.nextInt();
		input.nextLine();
		
		ControlAluno[] control = new ControlAluno[tamanho];
		String[] nomes = new String[tamanho];
		double[] nota1 = new double[tamanho];
		double[] nota2 = new double[tamanho];
		
		for(int i = 0 ; i < control.length; i++) {
		    System.out.println("Nome do aluno: ");
		    String nome = input.nextLine();
		    System.out.println("1° Nota: ");
		    double n1 = input.nextDouble();
		    System.out.println("2° Nota: ");
		    double n2 = input.nextDouble();
		    input.nextLine();

		    control[i] = new ControlAluno(new String[]{nome}, new double[]{n1}, new double[]{n2});
		}
		
		ControlAluno alunos = new ControlAluno();
		
		for(ControlAluno aluno : control) {
            aluno.getAprovados();
        }

		
		input.close();
	}

}
