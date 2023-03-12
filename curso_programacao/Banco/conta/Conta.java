package conta;

import java.util.Scanner;

import banco.Banco;

public class Conta extends Banco {

	private int numeroConta;
	private String nome;
	private double saldoConta;
	private Banco banco;// Variavel para armazenar objeto Banco

	public Conta(int numeroConta, String nome, double saldoConta, Banco banco) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldoConta = saldoConta;
	}

	public Conta(int numeroConta, String nome, Banco banco) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public int getNumeroConta() {
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
		this.saldoConta -= saque;
	}

	public void depositoSaldo(double deposito) {
		this.saldoConta += deposito;
	}

	public void decisions(Banco account) {
		Scanner input = new Scanner(System.in);
		double balance;
		int decision;

		do {
			System.out.println();
			System.out.println("what do you want to do next: ");
			System.out.println("-0- Exit:");
			System.out.println("-1- Deposit:");
			System.out.println("-2- withdraw:");
			decision = input.nextInt();

			while (decision != 0 && decision != 1 && decision != 2) {
				System.out.println("Invalid decision");
				System.out.println("answer again: ");
				decision = input.nextInt();
			}

			switch (decision) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("Enter a deposit value: ");
				balance = input.nextDouble();
				this.depositoSaldo(balance);
				System.out.println(account);
				break;
			case 2:
				System.out.println("Enter a withdraw value: ");
				balance = input.nextDouble();
				this.saqueSaldo(balance);
				System.out.println(account);
				break;
			}
		} while (decision != 0);
		input.close();
	}

	@Override
	public String toString() {
		return "Account: " + numeroConta 
				+ ", Holder: " + nome 
				+ ", Balance: R$ " + saldoConta;
	}
}
