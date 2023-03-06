package exercicioCap3Saude;
import javax.swing.JOptionPane;

public class Pessoa {

	public static void main(String[] args) {
		PerfilSaude dados = new PerfilSaude();

		//Recebendo os dados do usuário
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		dados.setNome(nome);//Armazenando nome dado pelo usuário
		
		String sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
		dados.setSobreNome(sobrenome);
		
		String sexoPessoa = JOptionPane.showInputDialog("Insira seu sexo: ");
		dados.setSexo(sexoPessoa);
		
		String s_alturaPessoa = JOptionPane.showInputDialog("Informe sua altura");
		double altura = Double.parseDouble(s_alturaPessoa);//Converte a String em um double
		dados.setAltura(altura);
		
		String pesoPessoa = JOptionPane.showInputDialog("Informe sua peso: ");
		double peso = Double.parseDouble(pesoPessoa);
		dados.setPeso(peso);
		
		String diaNascimento = JOptionPane.showInputDialog("Informe o dia do seu nascimento: ");
		int dia = Integer.parseInt(diaNascimento);//Converte a String em int
		dados.setDiaNascimento(dia);
		
		String mesNascimento = JOptionPane.showInputDialog("Informe o mes do seu nascimento: ");
		int mes = Integer.parseInt(mesNascimento);
		dados.setMesNascimento(mes);
		
		String anoNascimento = JOptionPane.showInputDialog("Informe o ano do seu nascimento: ");
		int ano = Integer.parseInt(anoNascimento);
		dados.setAnoNascimento(ano);
		
		//Criando as mensagens para informar ao usuário
		String nomeInformado = String.format("Nome: %s\n", dados.getNome());
		String sobreNomeInformado = String.format("Sobrenome: %s\n", dados.getSobreNome());
		String sexoInformado = String.format("Sexo: %s\n", dados.getSexo());
		String nascimentoInfo = String.format("Data Nascimento: %d/%d/%d\n", dados.getDiaNascimento(), dados.getMesNascimento(), dados.getAnoNascimento());
		String idadeAtual = String.format("Idade: %d\n", dados.getIdade(ano));
		String IMC = String.format("IMC: %.2f\n", dados.getIMC(peso, altura));
		String freqCardiacaMax = String.format("Frequência Caríaca Máxima: %d\n", dados.getfreqCardiacaMax(ano));
		String freqCardiacaAlvo = String.format("Frequência cardíaca alvo: %.2f", dados.getCardiacaAlvo(dados.getfreqCardiacaMax(ano)));
		
		
		//Exibindo as mensagens
		JOptionPane.showMessageDialog(null, nomeInformado);
		JOptionPane.showMessageDialog(null, sobreNomeInformado);
		JOptionPane.showMessageDialog(null, sexoInformado);
		JOptionPane.showMessageDialog(null, nascimentoInfo);
		JOptionPane.showMessageDialog(null, idadeAtual);
		JOptionPane.showMessageDialog(null, IMC);
		JOptionPane.showMessageDialog(null, freqCardiacaMax);
		JOptionPane.showMessageDialog(null, freqCardiacaAlvo);
		
		
	}

}
