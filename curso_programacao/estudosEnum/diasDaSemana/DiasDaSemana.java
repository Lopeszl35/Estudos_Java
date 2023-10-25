package diasDaSemana;

public class DiasDaSemana {

	public static void main(String[] args) {
		
		//Obtem todos os valores do enum EnumDias
		EnumDias[] dias = EnumDias.values();
		
		for(EnumDias dia : dias) {
			System.out.println("Dia: " + dia);
		}
		
	}

}
