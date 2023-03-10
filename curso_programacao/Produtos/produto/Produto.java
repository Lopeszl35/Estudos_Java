package produto;

public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	private double precoTotal;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public double getprecoTotal() {
		precoTotal = this.preco * this.estoque;
		return precoTotal;
	}
	
	public void setprecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public void addEstoque(int quantidade) {
		this.estoque += quantidade;
		this.precoTotal = this.preco * this.estoque;
	}
	
	public void removeEstoque(int quantidade) {
		this.estoque -= quantidade;
		this.precoTotal = this.preco * this.estoque;
	}

}
