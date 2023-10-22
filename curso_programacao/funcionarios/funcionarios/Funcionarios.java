package funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dadosFuncionario.DadosFuncionario;

public class Funcionarios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos funcionários serão registrados: ");
		int tamanho = input.nextInt();
		
		List<DadosFuncionario> Listafuncionarios = new ArrayList<>();
		
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Funcionario %d\n", i+1);
			System.out.println("Informe o ID: ");
			int id = input.nextInt();
			
			input.nextLine();
			System.out.println("Nome: ");
			String nome = input.nextLine();
			
			System.out.println("Salário: ");
			double salario = input.nextDouble();
			
			DadosFuncionario funcionarios = new DadosFuncionario(id, nome, salario);
			Listafuncionarios.add(funcionarios); // adiciona o objeto à lista
		}
		
		System.out.println("Informe o ID do funcionario que recebera aumento: ");
		int id = input.nextInt();
		System.out.println("Informe o aumento: ");
		double aumento = input.nextDouble();
		
		System.out.println("Lista antes do aumento do funcionario: ");
		
		for(DadosFuncionario f : Listafuncionarios) {
			System.out.println(f.toString());
		}
		
		DadosFuncionario control = new DadosFuncionario();
		
		control.aumentaSalario(Listafuncionarios, id, aumento);
		
		System.out.println();
		System.out.println("Lista de funcionários depois do aumento de salário:");
        for (DadosFuncionario f : Listafuncionarios) {
            System.out.println(f.toString());
        }
		
		
		
		input.close();
	}
}
