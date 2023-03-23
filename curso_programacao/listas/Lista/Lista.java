package Lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		//Criando uma lista de Strings
		List<String> list = new ArrayList<>();

		list.add("Nicoly");
		list.add("Rafael");
		list.add("Eduardo");
		list.add("Gustavo");
		list.add("Lucimara");
		
		//Adicionando elemento na posição 2
		list.add(2, "Marco");
		
		//Vendo tamanho da lista
		System.out.println(list.size());
		
		//Removendo elemento da lista
		list.remove("Marco");
		//Removendo por predicado
		list.removeIf(lista -> lista.charAt(0) == 'M');
		
		for(String lista : list) {
			System.out.println(lista);
		}
		
	}

}
