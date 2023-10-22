package controlPessoa;

public class ControlPessoa {
	private String nome;
	private int idade;
	
	public ControlPessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public ControlPessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public String pessoaVelha(ControlPessoa[] array) {
		int idade = 0;
		String nome = "";
		for(int i = 0; i < array.length; i++) {
			if(array[i].getIdade() > idade) {
				idade = array[i].getIdade();
			    nome = array[i].getNome();
			}
		}
		
		return nome;
	}
	

}
