package JanelaMensagemJava;
import javax.swing.JOptionPane;

public class DialagoCaixa {

	public static void main(String[] args) {
		
		//Pede ao usuário para inserir seu nome
		String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
		
		//Cria a mensagem
		String mensagem = String.format("Bem vindo %s, á programação Java", nome);
		
		
		//Exibe uma caixa de mensagem
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
