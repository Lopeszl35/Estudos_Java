package conta;

//import java.util.Scanner;

import banco.Banco;

public class Conta extends Banco {

	private String numeroConta;
	private String nome;
	private double saldoConta;

	public Conta(String numeroConta, String nome, double saldoConta) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		depositoSaldo(saldoConta);
	}

	public Conta(String numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public Conta() {
		
	}

	public String getNumeroConta() {
		return numeroConta;
	}
	
	public String getNumeroConta(Conta conta) {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void saqueSaldo(double saque) {
		this.saldoConta -= (saque + 5);
	}

	public void depositoSaldo(double deposito) {
		this.saldoConta += deposito;
	}

	@Override
	public String toString() {
		return "Account: " + numeroConta 
				+ ", Holder: " + nome 
				+ ", Balance: R$ " + String.format("%.2f", saldoConta);
	}

}
