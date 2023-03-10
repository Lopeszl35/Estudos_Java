package infoProdutos;
import java.util.Scanner;

import produto.Produto;

public class infoProdutos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Produto produto = new Produto();
		int condicao = 0, quantidade;
		
		System.out.println("Informe o nome do produto: ");
		String nome = input.nextLine();
		produto.setNome(nome);
		
		System.out.printf("Informe o preço do produto %s ", produto.getNome());
		double preco = input.nextDouble();
		produto.setPreco(preco);
		
		System.out.println("Informe a quantidade no estoque: ");
		int estoque = input.nextInt();
		produto.setEstoque(estoque);
		
		System.out.printf("Produto: %s, Preço: %.2f, Unidades: %d, Total: %.2f%n%n", produto.getNome(), produto.getPreco(), 
				produto.getEstoque(), produto.getprecoTotal());

		System.out.println("========== Oque deseja fazer a seguir? ============");
		System.out.println("-1- Adicionar produto ao estoque: ");
		System.out.println("-2- Remover produto do estoque: ");
		condicao = input.nextInt();
		
		while(condicao != 1 && condicao != 2) {
			System.out.println("Informe somente '1' ou '2': ");
			condicao = input.nextInt();
		}
		
		if(condicao == 1) {
			System.out.println("Informe a quantidade que serão adicionados ao estoque: ");
			quantidade = input.nextInt();
			produto.addEstoque(quantidade);
			System.out.println("============ Produto Atualizado ==========");
			System.out.printf("Produto: %s, Preço: %.2f, Unidades: %d, Total: %.2f", produto.getNome(), produto.getPreco(), 
					produto.getEstoque(), produto.getprecoTotal());
		}
		
		if(condicao == 2) {
			System.out.println("Informe a quantidade que serão removidos ao estoque: ");
			quantidade = input.nextInt();
			produto.removeEstoque(quantidade);
			System.out.println("============ Produto Atualizado ==========");
			System.out.printf("Produto: %s, Preço: %.2f, Unidades: %d, Total: %.2f", produto.getNome(), produto.getPreco(), 
					produto.getEstoque(), produto.getprecoTotal());
		}
		
		
		input.close();
	}

}
