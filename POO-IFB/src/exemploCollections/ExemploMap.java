package exemploCollections;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
		//Criando alunos para exemplo
		Aluno a1 = new Aluno("Tony Stark","29492jr92rj","Eletr�nica");
		Aluno a2 = new Aluno("Capit�o Am�rica","29443432amke","CFO");
		Aluno a3 = new Aluno("Capit� Marvel","e se eu tiver uma matricula igual para obj diferente?","Piloto");
		
		//Uma Map � uma cole��o que guarda objetos associando uma Chave a um Valor
		//Cada Chave deve ser �nica dentro do Mapa
		//Criando um mapa onde a chave � uma String e o valor � um Aluno
		Map<String, Aluno> turma = new HashMap<>();
		//Adicionando valor no Mapa
		turma.put("Mais Inteligente", a1);
		turma.put("Mais Forte", a2);
		turma.put("Mais Alto", a3);
		
		//'turma.keySet()' retorna o conjunto de Chaves dentro do mapa
		System.out.println(turma.keySet());
		//'turma.values()' retorna os Valores do mapa
		System.out.println(turma.values());
		//A fun��o 'get' retorna o valor associado a chave passada
		System.out.println(turma.get("Mais Inteligente"));
		
		//ForEach para imprimir todos as chaves e valores do Mapa
		for (String chave: turma.keySet()) {
			System.out.println(chave+ " -> "+turma.get(chave));
		}
		
		//Criando um novo aluno
		Aluno a4 = new Aluno("Bruce Banner","24r2r2r","Ciencia");
		//Adicionando o novo aluno no mapa, mas associando a um Chave j� existente.
		//O que acontece?
		turma.put("Mais Forte", a4);
		//ForEach para imprimir todos as chaves e valores do Mapa
		System.out.println("\n\n\n");
		for (String chave: turma.keySet()) {
			System.out.println(chave+ " -> "+turma.get(chave));
		}
		
		//Removendo o registro referente a chave 'Mais Inteligente'
		turma.remove("Mais Inteligente");
		System.out.println("\n\n\n");
		for (String chave: turma.keySet()) {
			System.out.println(chave+ " -> "+turma.get(chave));
		}
		

	}
	
}
