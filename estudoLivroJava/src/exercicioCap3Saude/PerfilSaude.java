package exercicioCap3Saude;
import java.time.LocalDate;


public class PerfilSaude {

	private String nome;
	private String sobreNome;
	private String sexo;
	private double altura;
	private double peso;
	private int dia;
	private int mes;
	private int ano;
	private double freqMinimo;
	private double freqMax;
	private double imc;
	

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getDiaNascimento() {
		return dia;
	}
	
	public void setDiaNascimento(int dia) {
		this.dia = dia;
	}
	
	public int getMesNascimento() {
		return mes;
	}
	
	public void setMesNascimento(int mes) {
		this.mes = mes;
	}
	
	public int getAnoNascimento() {
		return ano;
	}
	
	public void setAnoNascimento(int ano) {
		this.ano = ano;
	}
	
	public int getIdade(int ano) {
		//O método now() da classe LocalDate retorna a data atual, e o método getYear() 
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		int anosIdade =  anoAtual - this.ano;
		
		return anosIdade;
	}
	
	public int getfreqCardiacaMax(int ano) {
		int cardiacaMax = 220 - this.getIdade(this.ano);//This se refere ao método da propria classe
		
		return cardiacaMax;
	}
	
	public double getCardiacaAlvo(int cardiacaMax) {
		freqMinimo = cardiacaMax * 0.5;
		freqMax = cardiacaMax * 0.85;
		
		double freqAlvo = freqMinimo - freqMax;
		return freqAlvo;
	}

	public double getIMC(double peso, double altura) {
		this.imc = (peso * peso) / altura;
		
		return imc;
	}
	
}
