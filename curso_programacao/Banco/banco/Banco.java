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

			// Instancia um objeto que recebera um deposito
			Banco banco = new Banco();
			Conta account = new Conta(numberAccount, name, balance, banco);

			System.out.println("========= Account Data ===========");
			System.out.println(account);

			// O usuário tomará uma decisão de depositar ou sacar dinheiro
			account.decisions(account);
		}

		else if (conditionStr.equalsIgnoreCase("n")) {// Caso não tenha um depósito inicial
			// Instancia um objeto não que recebera um deposito
			Banco banco = new Banco();
			Conta accountNotBalance = new Conta(numberAccount, name, banco);
			System.out.println("========= Account Data ===========");
			System.out.println(accountNotBalance);

			// O usuário tomará uma decisão de depositar ou sacar dinheiro
			accountNotBalance.decisions(accountNotBalance);
		}

		input.close();
	}

}
