package produtoVetor;

import java.util.Scanner;

import controlProduto.ControlProduto;

public class Produto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantidadeProdutos;
		
		System.out.println("Informe a quantidade de produtos: ");
		quantidadeProdutos = input.nextInt();
		//Cria um objeto sendo um array
		ControlProduto[] produto = new ControlProduto[quantidadeProdutos];
		
		//For se inicia em 0 e vai até o final do tamanho do produto
		for(int i = 0; i < produto.length; i++) {
			input.nextLine();
			System.out.println("Informe o nome do produto: ");
			String nome = input.nextLine();
			System.out.println("Informe o preço: ");
			double preco = input.nextDouble();
			//Instanciando um objeto que é vetor de uma classe
			produto[i] = new ControlProduto(nome, preco);
		}
		
		double soma = 0.0;
		for(int i = 0; i < produto.length; i++) {
			soma += produto[i].getPreco();
		}
		double media = soma / produto.length;
		System.out.println("A média dos preços do produtos é = "+ media);
		
		
		input.close();
	}

}
