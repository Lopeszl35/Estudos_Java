package controlQuartos;

import java.time.LocalDate;

import disponibilidadeQuarto.Disponibilidade;

public class QuartoLuxo extends Quarto {
	private Integer camaCasal;
	private Boolean areaEstar;
	private Boolean vistaMar;
	
	public QuartoLuxo() {
		super();
	}
	
	
	public QuartoLuxo(Integer numQuarto, Double precoNoite, Integer camaCasal, Boolean areaEstar, Boolean vistaMar) {
		super(numQuarto, precoNoite);
		this.camaCasal = camaCasal;
		this.areaEstar = areaEstar;
		this.vistaMar = vistaMar;
	}

	
	public Integer getCamaCasal() {
		return camaCasal;
	}

	public void setCamaCasal(Integer camaCasal) {
		this.camaCasal = camaCasal;
	}

	public Boolean getAreaEstar() {
		return areaEstar;
	}

	public void setAreaEstar(Boolean areaEstar) {
		this.areaEstar = areaEstar;
	}

	public Boolean getVistaMar() {
		return vistaMar;
	}

	public void setVistaMar(Boolean vistaMar) {
		this.vistaMar = vistaMar;
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
