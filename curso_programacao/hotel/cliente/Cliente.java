package cliente;

public class Cliente {
	private String name;
	private Integer CPF;
	private String sexo;
	
	public Cliente() {
		
	}

	public Cliente(String name, Integer cpf, String sexo) {
		super();
		this.name = name;
		this.CPF = cpf;
		this.sexo = sexo;
	}

	public String getName() {
		return name;
	}


	public Integer getCPF() {
		return CPF;
	}


	public String getSexo() {
		return sexo;
	}

}
