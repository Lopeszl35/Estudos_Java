package Funcionario;

public class Funcionario {
	private String nome;
	private double salario;
	private double imposto;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void setImposto(double imposto, double salario) {
		this.imposto = imposto;
		this.salario -= this.imposto; 
	}

	public void salarioAumento(double aumento) {
		this.salario = salario + (this.salario *(aumento / 100));
	}
	
	public String toString() {
		return "Nome: " + nome
				+ ", Salário: " + String.format("%.2f", salario)
				+ ", Imposto: " + String.format("%.2f", getImposto());
	}
	
	public String toStringNewSalario() {
		return "Nome: " + nome
				+ ", Salário: " + String.format("%.2f", salario);
	}
	
	
	
}
