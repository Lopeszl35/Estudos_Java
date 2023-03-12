package control;

import java.util.Scanner;

import conta.Conta;

public class Control {
	Scanner input = new Scanner(System.in);
	private Conta conta;
	private String numeroConta;
	private String nomeConta;

	public Control(Conta conta) {
		this.conta = conta;
		/*this.conta.getNome();
		this.conta.getNumeroConta();
		this.conta.getSaldoConta();*/
	}

	public Control() {

	}
	
	public void decisions(Conta account) {
		Scanner input = new Scanner(System.in);
		int decision;
		double balance;

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
				conta.depositoSaldo(balance);
				System.out.println(account);
				break;
			case 2:
				System.out.println("Enter a withdraw value: ");
				System.out.print("$5 fee per withdrawal: ");
				balance = input.nextDouble();
				conta.saqueSaldo(balance);
				System.out.println(account);
				break;
			}
		} while (decision != 0);
		input.close();
	}
	
	//Checa se o usuário informou o numero da conta corretamente
	public String isDigit(String numeroConta) {
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
			else {
				this.numeroConta = numeroConta;
			}

			isNumeric = true;
			for (int i = 0; i < this.numeroConta.length(); i++) {
				if (!Character.isDigit(this.numeroConta.charAt(i))) {
					isNumeric = false;
					break;
				}
			}
		}while(isNumeric == false);
		return this.numeroConta;
	}
	
	//Checa se o usuário informou o nome da conta corretamente
	public String isCaracter(String nomeConta) {
		boolean isCaracter = true;
		do {
			for(int i = 0; i < nomeConta.length(); i++) {
				if(!Character.isAlphabetic(nomeConta.charAt(i)) && 
						!Character.isWhitespace(nomeConta.charAt(i))) {
					isCaracter = false;
					break;
				}
			}
				
				if(isCaracter == false) {
					System.out.println();
					System.out.println("Invalid account name");
					System.out.println("inform only letters: ");
					this.nomeConta = input.nextLine();
				}
				else {
					this.nomeConta = nomeConta;
				}
				isCaracter = true;
				for(int i = 0; i < this.nomeConta.length(); i++) {
					if(!Character.isAlphabetic(this.nomeConta.charAt(i)) && 
							!Character.isWhitespace(this.nomeConta.charAt(i))) {
						isCaracter = false;
						break;
					}
				}
			
		}while(isCaracter == false);
		return this.nomeConta;
	}
}
