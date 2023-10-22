package pessoa;

public class PessoaControl {
	private double altura;
	private String genero;
	
	public PessoaControl(double altura, String genero) {
		this.altura = altura;
		this.genero = genero;
	}
	
	public PessoaControl() {
		
	}

	public double getAltura() {
		return altura;
	}

	public String getGenero() {
		return genero;
	}
	
	public void getAlturas(PessoaControl[] array) {
		double soma = 0.0, menor_alt = 999, maior_alt = 0,
				media;
		int num_homens = 0, num_mulheres = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].getAltura() < menor_alt) {
				menor_alt = array[i].getAltura();
			}
			if(array[i].getAltura() > maior_alt) {
				maior_alt = array[i].getAltura();
			}
			if(array[i].getGenero().equalsIgnoreCase("m")) {
				num_homens++;
			}
			if(array[i].getGenero().equalsIgnoreCase("f")) {
				num_mulheres++;
			}
			if(array[i].getGenero().equalsIgnoreCase("f")) {
				soma += array[i].getAltura();
			}
		}
		media = soma / num_mulheres;
		
		System.out.printf("Menor altura: %.2f\n", menor_alt);
		System.out.printf("Maior altura: %.2f\n", maior_alt);
		System.out.printf("Média das alturas das mulheres %.2f\n", media);
		System.out.printf("Número de homens %d\n", num_homens);
	}
	
	

}
