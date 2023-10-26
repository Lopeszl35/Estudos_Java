package estações;

import java.util.Scanner;

public class P_Estacoes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o mês desejado: ");
		String mesDigitado = input.nextLine().trim().toUpperCase();
		
		// Validando a entrada do usuário
		try {
			Estacoes.Meses mes = Estacoes.Meses.valueOf(mesDigitado);
			Estacoes estacao = Estacoes.estacaoParaMes(mes);
			System.out.println("A estação correspondente a " + mes + " è " + estacao);
		} catch (IllegalArgumentException e) {
            System.out.println("Mês inválido. Certifique-se de digitar um mês válido, por exemplo: JANEIRO");
        }
		
		
		input.close();
	}

}
