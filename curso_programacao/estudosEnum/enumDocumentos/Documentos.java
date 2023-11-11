package enumDocumentos;

public enum Documentos {
	RG,
	CPF,
	CNH,
	PASSAPORTE;

	
	public static String informacoesDocumento(Documentos documento) {
		switch(documento) {
		case RG:
			return "Documento Escolhido: RG: Este é um documento de identidade";
		case CPF:
			return "Documento Escolhido: CPF: Este é um cadastro de Pessoa Física";
		case CNH:
			return "Documento Escolhido: CNH: Está é uma carteira Nacional de Habilitação";
		case PASSAPORTE:
			return "Documento Escolhido: PASSAPORTE: Este é um documento de viagem Nacional";
		default:
			throw new IllegalArgumentException("Documento inválido");
		}
	}

	
}