package controlPessoas;

import pessoa.Pessoa;

public class ControlPessoa {

	
	public ControlPessoa() {
		
	}
	
	public double getMedia(Pessoa[] pessoa) {
		double media, soma = 0;
		
		for(int i = 0; i < pessoa.length; i++) {
			soma += pessoa[i].getAltura();
		}
		media = soma / pessoa.length;
		
		return media;
	}
	
	public double getPorcentagem16(Pessoa[] pessoa) {
		double porcentagem = 0;
		int menos16 = 0;
		
		for(int i = 0; i < pessoa.length; i++){
			if(pessoa[i].getIdade() < 16) {
				menos16++;
			}
			porcentagem = ((double) menos16 / pessoa.length) * 100;
		}
		
		return porcentagem;
	}
	
	
}
