package ControllerAccount;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		//Cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//Declarando a Classe Account e seus objetos
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		//Exibe saldo inicial de cada objeto
		System.out.printf("%s balance: %.2f\n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f\n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();//Obtem a entrada do usuário
		System.out.printf("%nadding %.2f to account1 balance\n\n", depositAmount);
		account1.deposit(depositAmount);//Adiciona o saldo a account1
		
		//Exibe os saldos
		System.out.printf("%s balance: $%.2f\n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f\n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance\n\n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f\n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f\n", account2.getName(), account2.getBalance());
		
		
		
		input.close();
	}

}
