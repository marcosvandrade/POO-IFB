package exemploCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploSet {
	
	public static void main(String[] args) {
		//A interface Set representa os conjuntos.
		//Semelhante a uma Lista, mas n�o s�o permitidos
		//objetos duplicados.
		//Tamb�m n�o temos garantia de ordena��o em um conjunto.
		//List<Integer> notas = new ArrayList<Integer>();
		Set<Integer> notas = new HashSet<>();
		notas.add(5);
		notas.add(7);
		notas.add(8);
		notas.add(6);
		//Adicionando o n�mero 5 no conjunto. Ser� que vai ser adicionado?
		notas.add(5);
		notas.add(10);
		
		//Utilizando o ForEach para imprimir todas as notas e somar
		//os valores do conjunto
		int soma = 0;
		for (Integer umaNota : notas) {
			System.out.println(umaNota);
			soma += umaNota;
		}
		System.out.println("soma das notas = "+soma);
		
		
	}

}
