package dadosFuncionario;

import java.util.List;

public class DadosFuncionario {
	private int id;
	private String nome;
	private double salario;

	public DadosFuncionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public DadosFuncionario() {
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
        return salario;
    }
	
	
	
	@Override
	public String toString() {
		return "ID: " + id 
				+ ", Nome: " + nome 
				+ ", Salário: " + salario;
	}

	public void aumentaSalario(List<DadosFuncionario> Listafuncionarios, int id, double aumento) {
		for(DadosFuncionario f : Listafuncionarios) {
			if(f.getId() == id) {
				this.salario = (aumento / 100 * f.salario) + f.salario;
			}
			else {
				System.out.println("Funcionario com ID " + id + " não encontrado");
			}
		}
	}
	
}