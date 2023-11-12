package statusPedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Ordem {
	private String nome;
	private double preco;
	private StatusPedido status;
	private LocalDateTime hora;
	private List<Ordem> ordens;
	
	
	public Ordem(String nome, double preco, StatusPedido status, LocalDateTime hora) {
		this.nome = nome;
		this.preco = preco;
		this.status = status;
		this.hora = hora;
	}
	
	public Ordem() {
		
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public LocalDateTime getHora() {
		return hora;
	}
	
	public void setOrdens(List<Ordem> ordens) {
	    this.ordens = ordens;
	}

	
	public static String obterNome(Scanner input) {
		String nome;
		do {
			System.out.println();
			System.out.println("Digite o nome do pedido: ");
			nome = input.nextLine().trim();
			if(nome.isEmpty() || !contemLetra(nome)) {
				System.out.println("O nome do produto deve conter letras ou letras e números");
			}
		}while (nome.isEmpty() || !contemLetra(nome)); // Verifica se contém pelo menos uma letra
		return nome;
	}
	
	public static boolean contemLetra(String str) {
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				return true;
			}
		}
		return false;
	}
	
	public static double obterPreco(Scanner input) {
		double preco = 0.0;
		boolean entradaValida = false;
		
		while(!entradaValida) {
			try {
				System.out.println("Digite o preço do produto ");
				preco = Double.parseDouble(input.nextLine());
				entradaValida = true;
			} catch (NumberFormatException e) {
				System.out.println("Preço inválido! Digite um valor numérico.");
			}
		}
		return preco;
	}
	
	public static String obterStatus(Scanner input) {
		String status;
		
		do {
			System.out.println("Digite o status do pedido: ");
            status = input.nextLine().trim().toUpperCase();
		} while(!status.equals("PROCESSANDO") && !status.equals("ENVIADO") && !status.equals("ENTREGUE") && !status.equals("CANCELADO"));
		return status;
	}
	
	public static String formatarHora(LocalDateTime hora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return hora.format(formatter);
    }

	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();

        if (ordens != null) {
            for (Ordem ordem : ordens) {
                sb.append("Ordem Nome: ").append(ordem.getNome())
                        .append("\n Preço: ").append(ordem.getPreco())
                        .append("\n Status: ").append(ordem.getStatus())
                        .append("\n Hora do pedido: ").append(formatarHora(ordem.getHora()))
                        .append("\n");
            }
        }

        return sb.toString();
    }
}
