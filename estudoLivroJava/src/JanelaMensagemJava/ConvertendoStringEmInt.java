package JanelaMensagemJava;
import javax.swing.JOptionPane;

public class ConvertendoStringEmInt {

	public static void main(String[] args) {
		int num1, num2, calculo;
		
		//Recebe do usuário um valor em formato String
		String s_num1 = JOptionPane.showInputDialog("Informe um valor: ");
		String s_num2 = JOptionPane.showInputDialog("Informe um segundo valor: ");
		
		//Converte os valores de String para int
		num1 = Integer.parseInt(s_num1);
		num2 = Integer.parseInt(s_num2);
		
		calculo = num1 * num2;
		
		//Cria a mensagem para ser informada na caixa de mensagem
		String mensagem = String.format("%d * %d = %d", num1, num2, calculo);
		
		//Exibe uma caixa de mensagem com o valor da "mensagem"
		JOptionPane.showMessageDialog(null, mensagem);
		
		
	}

}
