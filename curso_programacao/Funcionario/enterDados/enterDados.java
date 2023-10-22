package enterDados;
import java.util.Scanner;

import Funcionario.Funcionario;

public class enterDados {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o seu nome: ");
		String nome = input.nextLine();
	    funcionario.setNome(nome);
	    
	    System.out.println("Informe o seu sálario: ");
	    double salario = input.nextDouble();
	    funcionario.setSalario(salario);
	    
	    System.out.println();
	    System.out.println("Informe o desconto do imposto: ");
	    double imposto = input.nextDouble();
	    funcionario.setImposto(imposto, salario);
	    
	    System.out.println("Funcionario: " + funcionario.toString());
	    
	    System.out.println("Informe a porcentagem de aumento do sálario: ");
	    double aumento = input.nextDouble();
	    funcionario.salarioAumento(aumento);
	    
	    System.out.println("=========== Dados atualizados ==========");
	    System.out.println("Funcionario: " + funcionario.toStringNewSalario());
	    
	    
	    input.close();
	}

}
