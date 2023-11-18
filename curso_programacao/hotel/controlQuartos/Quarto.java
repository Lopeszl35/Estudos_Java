package controlQuartos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Quarto {
	private Integer numQuarto;
	private Double precoNoite = 150.00;
	protected List<Reserva> reservas = new ArrayList<>();
	
	public Quarto() {
		
	}

	public Quarto(Integer numQuarto, Double precoNoite) {
		this.numQuarto = numQuarto;
		this.precoNoite = precoNoite;
	}

	public Integer getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Double getPrecoNoite() {
		return precoNoite;
	}

	public void setPrecoNoite(Double precoNoite) {
		this.precoNoite = precoNoite;
	}
	
	public abstract boolean verificarDisponibilidade(LocalDate data);
	
	

}
