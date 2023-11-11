package enumDocumentos;

import java.util.Scanner;

public class ExibeDocumentos {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
        	System.out.println();
            System.out.println("Digite o tipo de documento (RG, CPF, CNH, PASSAPORTE) ou 'sair' para encerrar:");
            String documentoSolicitado = input.nextLine().trim().toUpperCase();

            if (documentoSolicitado.equals("SAIR")) {
                System.out.println("Encerrando o programa...");
                break; // Sai do loop se o usuário digitar 'sair'
            }

            try {
                Documentos documento = Documentos.valueOf(documentoSolicitado);
                System.out.println(Documentos.informacoesDocumento(documento));
            } catch (IllegalArgumentException e) {
                System.out.println("Documento inválido. Certifique-se de digitar corretamente, por exemplo: RG");
                System.out.println();
            }
        }

        input.close();
    }
}