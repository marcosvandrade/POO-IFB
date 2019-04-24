package exemploCollections;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		//Criando Alunos para o exemplo
		Aluno a1 = new Aluno("Tony Stark","29492jr92rj","Eletr�nica");
		Aluno a2 = new Aluno("Capit�o Am�rica","29443432amke","CFO");
		Aluno a3 = new Aluno("Capit� Marvel","0013434329","Piloto");
		
		//Criando uma lista de Alunos
		//List � uma interface que diz o que uma lista deve implementar
		//ArrayList � uma implementa��o da Interface List
		//o trecho <Aluno> restringe o uso da lista para adi��o de objetos da classe Aluno
		List<Aluno> alunos = new ArrayList<>();
		//Adicionando os alunos na lista
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		//Imprimindo o aluno com �ndice 1 da lista
		System.out.println(alunos.get(1));
		//Removendo o aluno com �ndice 1 da lista
		alunos.remove(1);
		//Imprimindo o novo aluno com �ndice 1 da lista (O antigo foi apagado)
		System.out.println(alunos.get(1));
		
		//Verificando se o aluno 'a2' est� na lista
		//O m�todo contains retorna verdadeiro ao achar o objeto
		//na lista e falso caso contr�rio
		if(alunos.contains(a2)) {
			System.out.println("Aluno "+ a1+ " na lista");
		}else {
			System.out.println("Aluno n�o encontrado");
		}
		
		//Imprimindo a lista completa de alunos utilizando um for tradicional
		System.out.println("Alunos na lista:");
		for (int i = 0; i < alunos.size(); i++) {
			Aluno temp = alunos.get(i);
			System.out.println(temp);
		}
		
		//Imprimindo a lista dos alunos utilizando o ForEach
		//O ForEach serve para percorrer todos os objetos de uma cole��o.
		//o objeto 'Aluno aluno' criado � um objeto tempor�rio que receber�
		//cada objeto da lista 'alunos' que � especificada ap�s o ':'.
		//Todos os objetos realizar�o os comandos que foram especificados no ForEach.
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		
		
		
		
		
		//Para utilizar listas com tipos num�ricos, utilizar o objeto Java correspondente
		//int -> Integer, double -> Double...
		List<Double> notas = new ArrayList<>();
		notas.add(4.4);
		
		
		
		
		
	}
	
}
