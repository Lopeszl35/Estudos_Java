package ControllerAccount;

public class Account {
	
	private String name; // Variavel de instância
	private double balance; //Variavel de instância
	
	public Account() {//Cria um construtor sem parametrôs de entrada
		this.name = "";
	}

	//O construtor inicializa name com o nome do parametro
	public Account(String name, double balance) {//O nome do construtor é o nome do classe
		this.name = name;//Atribui uma variavel de intância a name
		
		//Válida que balance é maior que 0.0 se não for,
		//a variavel de instância mantem seu valor inicial padrão 0.0
		if(balance > 0.0)//Se o saldo for válido 
			this.balance = balance;//Atribui a variavel  de instância a balance
	}
	
	//Método para deposito
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0)//Se o valor do deposito for maior que 0.0
			balance += depositAmount;//O saldo da conta sera atualizado com o valor do saldo mais o valor do deposito
	}
	
	//Método que retorna o saldo da conta
	public double getBalance() {
		return balance;
	}

	//Método para colocar o saldo na conta
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//Método para recuperar o nome do objeto
	public String getName() {
		return name;//Retorna o valor do nome para o chamador
	}

	//Método para definir o nome do objeto
	public void setName(String name) {
		this.name = name;//Armazena o nome
	}
	
	
	
}
