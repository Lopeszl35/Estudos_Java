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
	
	public ControlValor(double valor, int posicao) {
		this.valor = valor;
		this.posicao = posicao;
		
	}
	
	public static ControlValor getMaiorValor(Valor[] valor) {
		double maior = Double.NEGATIVE_INFINITY;
		int posicao = -1;
		for(int i = 0; i < valor.length; i++) {
			if(valor[i].getNumero() > maior) {
				maior = valor[i].getNumero();
				posicao = i;
			}
		}
		return new ControlValor(maior, posicao);
	}

}
