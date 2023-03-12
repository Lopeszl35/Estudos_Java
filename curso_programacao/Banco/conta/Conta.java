package conta;
import control.Control;

public class Conta{
	Control control = new Control();

	private String numeroConta;
	private String nome;
	private double saldoConta;

	public Conta(String numeroConta, String nome, double saldoConta) {
		this.numeroConta = control.isDigit(numeroConta);
		this.nome = control.isCaracter(nome);
		depositoSaldo(saldoConta);
	}

	public Conta(String numeroConta, String nome) {
		this.numeroConta = control.isDigit(numeroConta);
		this.nome = control.isCaracter(nome);
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