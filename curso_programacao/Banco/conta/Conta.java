package conta;

import java.util.Scanner;
import control.Control;

public class Conta{
	Scanner input = new Scanner(System.in);
	Control controle = new Control();

	private String numeroConta;
	private String nome;
	private double saldoConta;

	public Conta(String numeroConta, String nome, double saldoConta) {
		this.numeroConta = controle.isDigit(numeroConta);
		this.nome = nome;
		depositoSaldo(saldoConta);
	}

	public Conta(String numeroConta, String nome) {
		boolean isNumeric = true;
		do {// Verifica se o número da conta contém caracteres
			for (int i = 0; i < numeroConta.length(); i++) {
				if (!Character.isDigit(numeroConta.charAt(i))) {
					isNumeric = false;
					break;
				}
			}
			if (isNumeric == false) {
				System.out.println();
				System.out.println("Account number is invalid");
				System.out.println("Enter only numerical digits: ");
				this.numeroConta = input.nextLine();
			}

			isNumeric = true;
			for (int i = 0; i < this.numeroConta.length(); i++) {
				if (!Character.isDigit(this.numeroConta.charAt(i))) {
					isNumeric = false;
					break;
				}
			}
		}while(isNumeric == false);
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