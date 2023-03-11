package conta;

public class Conta {
	private int numeroConta;
	private String nome;
	private double saldoConta;
	
	
	public Conta(int numeroConta, String nome, double saldoConta) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldoConta = saldoConta;
	}
	
	public Conta(int numeroConta, String nome) {
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

	@Override
	public String toString() {
		return "Account: " + numeroConta 
				+ ", Holder: " + nome 
				+ ", Balance: R$ " + saldoConta;
	}
}
