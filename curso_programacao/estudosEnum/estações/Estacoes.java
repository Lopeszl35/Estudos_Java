package estações;

public enum Estacoes {
	PRIMAVERA,
	VERÃO,
	OUTONO,
	INVERNO;
	
	public static Estacoes estacaoParaMes(Meses mes) {
		switch(mes) {
		case MARÇO:
		case ABRIL:
		case MAIO:
			return PRIMAVERA;
		case JUNHO:
		case JULHO:
		case AGOSTO:
			return VERÃO;
		case SETEMBRO:
		case OUTUBRO:
		case NOVEMBRO:
			return OUTONO;
		case DEZEMBRO:
		case JANEIRO:
		case FEVEREIRO:
			return INVERNO;
		default:
			throw new IllegalArgumentException("Mês inválido");
		}
		
	}
	
	public enum Meses{
		JANEIRO,
		FEVEREIRO,
		MARÇO,
		ABRIL,
		MAIO,
		JUNHO,
		JULHO,
		AGOSTO,
		SETEMBRO,
		OUTUBRO,
		NOVEMBRO,
		DEZEMBRO;
	}

}
