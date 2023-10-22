package controlQuartos;

public class ControlQuartos {
	private String nome;
	private String email;
	private int quarto;
	
	public ControlQuartos(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public ControlQuartos() {
		
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getQuarto() {
		return quarto;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome 
				+ ", E-mail: " + email 
				+ ", Quarto: " + quarto;
	}

	public void getQuartosAlugados(ControlQuartos[] array) {
		System.out.println("quartos alugados");
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				System.out.println(array[i].toString());
			}
		}
	}
	
	

}
