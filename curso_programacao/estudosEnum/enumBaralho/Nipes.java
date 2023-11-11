package enumBaralho;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Nipes {
	PAUS,
	COPAS,
	OUROS,
	ESPADAS;
	
	private static final Random random = new Random();
	
	public static Nipes gerarNipes() {
		List<Nipes> nipe = new ArrayList<>();
		nipe.add(PAUS);
		nipe.add(COPAS);
		nipe.add(OUROS);
		nipe.add(ESPADAS);
		
		int posicao = random.nextInt(4);
		
		return nipe.get(posicao);
		
	}

}
