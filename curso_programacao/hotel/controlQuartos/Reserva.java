package controlQuartos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import cliente.Cliente;
import disponibilidadeQuarto.Disponibilidade;

public class Reserva {
	 private Cliente cliente;
	 private Quarto quarto;
	 private LocalDate data;
	 private Disponibilidade disponibilidade;
	 private List<Reserva> reservas = new ArrayList<>();
	 
	 
	 public Reserva() {
		 
	 }


	public Reserva(Cliente cliente, Quarto quarto, LocalDate data, Disponibilidade disponibilidade) {
		this.cliente = cliente;
		this.quarto = quarto;
		this.data = data;
		this.disponibilidade = disponibilidade;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public Quarto getQuarto() {
		return quarto;
	}


	public LocalDate getData() {
		return data;
	}
	
	
	
	public Disponibilidade getDisponibilidade() {
		return disponibilidade;
	}


	public void setDisponibilidade(Disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}


	public void addReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	 
	 
	 
}
