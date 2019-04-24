package exemploCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploSetAlunos {

	public static void main(String[] args) {
		//Criando alunos para exemplo
		Aluno a1 = new Aluno("aTony Stark","29492jr92rj","Eletr�nica");
		Aluno a2 = new Aluno("Capit�o Am�rica","29443432amke","CFO");
		Aluno a3 = new Aluno("Capit� Marvel","e se eu tiver uma matricula igual para obj diferente?","Piloto");
				
		//Criando conjunto(Set) de alunos.
		//A classe HashSet � a principal implementa��o da interface 'Set'
		Set<Aluno> turma = new HashSet<>();
		//Adicionando objetos ao conjunto
		turma.add(a1);
		turma.add(a2);
		turma.add(a3);
		//Criando e adicionando objetos ao conjunto
		//Percebam que a matr�cula � a mesma do objeto 'a2'
		turma.add(new Aluno("Bruce Banner","e se eu tiver uma matricula igual para obj diferente?","Ciencia"));
		//Usando o ForEach para imprimir todos os alunos do conjunto
		for (Aluno aluno : turma) {
			System.out.println(aluno);
		}
		
		System.out.println("\n\n\n\n");
		//Criando e adicionando um aluno repetido. Ser� que adiciona? 
		Aluno a4 = new Aluno("Capit�o Am�rica","29443432amke","CFO");
		turma.add(a4);
		//Imprimindo novamente os alunos
		for (Aluno aluno : turma) {
			System.out.println(aluno);
		}
		//Percebam que a verifica��o de igualdade de um aluno � baseada 
		//no m�todo HashCode da classe aluno.

		
		System.out.println("\n\n\n\n");
		//Como imprimir o conjunto ordenadamente?
		//Cria uma lista
		List<Aluno> listOrdenada = new ArrayList<Aluno>();
		//Adiciona todo o conjunto na lista
		listOrdenada.addAll(turma);
		//Ordena a Lista com base no m�todo 'compareTo' da classe Aluno
		Collections.sort(listOrdenada);
		//imprimindo a lista ordenada
		for (Aluno aluno : listOrdenada) {
			System.out.println(aluno);
		}
		
	}
	
	
}
