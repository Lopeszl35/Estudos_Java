package Estudante;

public class Estudante {
	private String[] nome;
	private double[][] notas;
	
	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public double[][] getNotas() {
	    return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public void alunoAprovacao(String[] nomes, double[][] notas) {
	    for(int i = 0; i < nomes.length; i++) {
	      double soma = notas[i][0] + notas[i][1] + notas[i][2];
	      int pontos = 0;
	        
	      if(soma >= 60) {
	          System.out.println("Aluno " + nomes[i] + " aprovado");
	      }
	      else {
	        while(soma < 60) {
		      pontos++;
		      soma++;
		    }
	          System.out.println("Aluno " + nomes[i] + " reprovado");
	          System.out.printf("Faltou + %d na nota para aprovação%n", pontos);
	          System.out.println();
	     }
	     pontos = 0;
	     soma = 0;
	   }
	}

	
	
	
}
