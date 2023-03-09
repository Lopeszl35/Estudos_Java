package FunçõesStrings;

public class todasMinusuclas {

	public static void main(String[] args) {
		
		String original = "- RAFAEL amaro LOPES -";
		
		//Converte as letras maiusculas e minusculas
		String minuscula = original.toLowerCase();
		String maiuscula = original.toUpperCase();
		
		//elimina espaços em branco
		String trim = original.trim();
		
		//Substring, imprimi caracteres somente a partir de uma condição
		//Também pode ser usudo para recortar uma string
		String substring = original.substring(5);
		
		//Substituir um caracter por outro
		String substituir = original.replace("a", "f");
		
		System.out.println(original);
		System.out.println(minuscula);
		System.out.println(maiuscula);
		System.out.println(trim);
		System.out.println(substring);
		System.out.println(substituir);
		
	}

}
