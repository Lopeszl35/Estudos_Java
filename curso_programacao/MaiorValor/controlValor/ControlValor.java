package controlValor;

import valor.Valor;

public class ControlValor {
	private double valor;
	private int posicao;
	
	
	
	public double getValor() {
		return valor;
	}

	public int getPosicao() {
		return posicao;
	}

	public ControlValor() {
		
	}
	
	//Constructor que ira receber o retorno do método Static getMaiorValor
	public ControlValor(double valor, int posicao) {
		this.valor = valor;
		this.posicao = posicao;
		
	}
	
	//Método ira receber o array com os valores
	public static ControlValor getMaiorValor(Valor[] valor) {
		double maior = Double.NEGATIVE_INFINITY;
		int posicao = -1;
		for(int i = 0; i < valor.length; i++) {
			if(valor[i].getNumero() > maior) {
				maior = valor[i].getNumero();
				posicao = i;
			}
		}//Ira retorna um novo objeto da classe com o valor e a posição do valor no array
		return new ControlValor(maior, posicao);
	}

}
