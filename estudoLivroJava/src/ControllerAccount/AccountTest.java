package ControllerAccount;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		//Cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//Cria um objeto Account e o atribui a myAccount
		Account myAccount = new Account(); //Objeto myAccount não inicializado
		Account myAccount1 = new Account("Rafael", 50.00);//Objeto inicializado com o valor "Rafael", e valor do saldo
		Account myAccount2 = new Account("John Grene", -7.25);//Objeto inicializado com o valor "Rafael", e valor do saldo
		Account nomeConta = new Account();//Objeto conta não inicializado
		Account balance = new Account();//Objeto balance(saldo) não inicializado
		
		System.out.printf("O saldo da conta de %s é %.2f\n", myAccount1.getName(), myAccount1.getBalance());
		System.out.printf("O saldo da conta de %s é %.2f\n", myAccount2.getName(), myAccount2.getBalance());
		
		//Solicita e le o nome
		System.out.println("Please enter the name: ");
		String theName = input.nextLine();// Lê a String informada pelo usuário
		myAccount.setName(theName);//Insere o nome dado pelo usuário em theName, usando os métodos da clase Account
		//Exibe o nome armazenado no objeto myAccount
		System.out.printf("Name the Account is: %s\n", myAccount.getName());
		
		System.out.println("Please enter the name of the Account: ");
		String nome = input.nextLine();
		nomeConta.setName(nome);
		
		System.out.println("Please enter the balance of the Account: ");
		double saldo = input.nextDouble();
		balance.setBalance(saldo);
		
		System.out.printf("O nome da conta informada é %s\n", nomeConta.getName());
		System.out.printf("O saldo desta conta é %.2f", balance.getBalance());
		
		
		
		
		input.close();
	}

}
