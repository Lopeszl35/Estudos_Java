package controlQuartos;

import java.time.LocalDate;

import disponibilidadeQuarto.Disponibilidade;

public class QuartoSimples extends Quarto {
	private Integer Camas;
	private Integer banheiros;

	
	public QuartoSimples() {
		super();
	}


	public QuartoSimples(Integer numQuarto, Double precoNoite, Integer camas, Integer banheiros) {
		super(numQuarto, precoNoite);
		this.Camas = camas;
		this.banheiros = banheiros;
	}


	public Integer getCamas() {
		return Camas;
	}


	public void setCamas(Integer camas) {
		Camas = camas;
	}


	public Integer getBanheiros() {
		return banheiros;
	}


	public void setBanheiros(Integer banheiros) {
		this.banheiros = banheiros;
	}
	
	@Override
	public boolean verificarDisponibilidade(LocalDate data) {
		for (Reserva reserva : reservas) {
			if(reserva.getData().equals(data) && reserva.getDisponibilidade() == Disponibilidade.OCUPADO) {
				return false; //Quarto ja ocupado
			}
		}
        
		return true;
	}
	
}
