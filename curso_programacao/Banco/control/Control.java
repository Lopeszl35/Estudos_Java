package control;

import java.util.Scanner;

import conta.Conta;

public class Control {
	private Conta conta;

	public Control(Conta conta) {
		this.conta = conta;
		this.conta.getNome();
		this.conta.getNumeroConta();
		this.conta.getSaldoConta();
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
				System.out.print("$5 fee per withdrawal ");
				balance = input.nextDouble();
				conta.saqueSaldo(balance);
				System.out.println(account);
				break;
			}
		} while (decision != 0);
		input.close();
	}
}
