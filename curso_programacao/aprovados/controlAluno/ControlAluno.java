package controlAluno;

public class ControlAluno {
	private String[] aluno;
	private double[] nota1;
	private double[] nota2;
	
	public ControlAluno(String[] aluno, double[] nota1, double[] nota2) {
		this.aluno = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public ControlAluno() {
	    
	}

	public String[] getAluno() {
		return aluno;
	}

	public double[] getNota1() {
		return nota1;
	}

	public double[] getNota2() {
		return nota2;
	}
	
	public void getAprovados() {
	    for(int i = 0; i < aluno.length; i++) {
	        double media = (nota1[i] + nota2[i]) / 2.0;
	        if(media >= 6.0) {
	            System.out.printf("Aluno %s aprovado%n", aluno[i]);
	        }
	        else {
	        	 System.out.printf("Aluno %s reprovado%n", aluno[i]);
	        }
	    }
	}
}
