package banco;

import java.util.Scanner;

import conta.Conta;

public class Banco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double balance;

		System.out.println("Enter account number: ");
		int numberAccount = input.nextInt();
		input.nextLine();

		System.out.println("Enter account holder: ");
		String name = input.nextLine();

		System.out.println("Is there an initial deposit (Y/N): ");
		String conditionStr = input.nextLine();

		// Verifica se a entrada é válida
		while (conditionStr.length() != 1 && !conditionStr.equalsIgnoreCase("N")
				&& !conditionStr.equalsIgnoreCase("Y")) {
			
			System.out.println("Invalid input. Please enter a single character.");
			conditionStr = input.nextLine();
		}

		if (conditionStr.equalsIgnoreCase("y")) {// Caso tenha um depósito inicial
			System.out.println("Enter initial deposit value: ");
			balance = input.nextDouble();

			//Instancia um objeto que recebera um deposito
			Conta account = new Conta(numberAccount, name, balance);

			System.out.println("========= Account Data ===========");
			System.out.println(account);
			
			System.out.println("what do you want to do next: ");
			System.out.println("-0- Exit:");
			System.out.println("-1- Deposit:");
			System.out.println("-2- withdraw:");
			int decision = input.nextInt();
			
			while(decision != 0 && decision != 1 && decision != 2) {
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
					account.depositoSaldo(balance);
					System.out.println(account);
					break;
				case 2:
					System.out.println("Enter a withdraw value: " );
					balance = input.nextDouble();
					account.saqueSaldo(balance);
					System.out.println(account);
					break;
			}
		}

		else if (conditionStr.equalsIgnoreCase("n")) {// Caso não tenha um depósito inicial
			//Instancia um objeto não que recebera um deposito
			Conta accountNotBalance = new Conta(numberAccount, name);
			System.out.println("========= Account Data ===========");
			System.out.println(accountNotBalance);
			
			System.out.println("what do you want to do next: ");
			System.out.println("-0- Exit:");
			System.out.println("-1- Deposit:");
			System.out.println("-2- withdraw:");
			int decision = input.nextInt();
			
			while(decision != 0 && decision != 1 && decision != 2) {
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
					accountNotBalance.depositoSaldo(balance);
					System.out.println(accountNotBalance);
					break;
				case 2:
					System.out.println("Enter a withdraw value: " );
					balance = input.nextDouble();
					accountNotBalance.saqueSaldo(balance);
					System.out.println(accountNotBalance);
					break;
			}
		}

		input.close();
	}

}
