package statusPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a quantidade de pedidos a serem processados: ");
		int n_Pedidos = input.nextInt();
		input.nextLine();
		Ordem controlOrdem = new Ordem();
		List<Ordem> ordens = new ArrayList<>();
		
		for(int i = 0; i < n_Pedidos; i++) {
			String nome = controlOrdem.obterNome(input);
			double preco = controlOrdem.obterPreco(input);
			String status = controlOrdem.obterStatus(input);
			StatusPedido statuspedido = StatusPedido.valueOf(status);
			LocalDateTime horaPedido = LocalDateTime.now();
			
			Ordem ordem = new Ordem(nome, preco, statuspedido, horaPedido);
			ordens.add(ordem);
		}
		controlOrdem.setOrdens(ordens);
		
		System.out.println(controlOrdem.toString());
		
		
		input.close();
	}

}
