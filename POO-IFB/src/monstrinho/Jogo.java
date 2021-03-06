package monstrinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programação Orientada a Objetos.
 *
 */

public class Jogo {

	public static void main(String[] args) {
		
		int encerrarJogo = 1;
		Scanner teclado = new Scanner(System.in);
		
		//criando um arraylist com o ranking
		ArrayList<Ranking> ranking = new ArrayList<>();
		
		while(encerrarJogo != 0) {
		
		System.out.println("Digite o nome do Monstrinho: ");
		String nome = teclado.nextLine();
		
		Monstrinho monstrinho = new Monstrinho(nome);
		int opcao = 0, opcaoOld = 0;
		
			System.out.println(monstrinho.nome + ", seu Monstrinho nasceu! Cuide dele com carinho!\n");
			System.out.println("Não deixe seus status chegarem a zero.\n");
			
			//Mostra o status do seu monstrinho
			monstrinho.status();
			//executa a repetição do jogo enquanto seu monstrinho está vivo
			while(monstrinho.estaVivo()) {
				
				//Mostra as opções e espera o jogador digitar sua escolha
				System.out.println("\n### TURNO "+monstrinho.turno+" ###");
				System.out.println("Escolha uma ação: ");
				
				System.out.print("1-Comer 2-Malhar 3-Descansar 4-Estudar 5-Trabalhar 6-Se divertir");
							
//				System.out.print("2- Malhar");
//				System.out.print("3- Descansar");
//				System.out.print("4- Estudar");
//				System.out.print("5- Trabalhar");
//				System.out.print("6- Se Divertir");
				
				
//				System.out.println("1- Comida    -> Saude + 2, Forca + 2, Energia + 2");
//				System.out.println("2- Malhação  -> Saude + 3, Forca + 2, Energia - 1");
//				System.out.println("3- Descansar -> Saude + 2, Forca + 1, Energia - 1");
//				System.out.println("4- Estudar   -> Saude - 1, Forca - 1, Energia - 1");
//				System.out.println("5- Trabalhar -> Saude - 1, Forca - 2, Energia - 1");
//				System.out.println("6- Diversao  -> Saude + 3, Forca - 1, Energia - 1");
				
				opcao = teclado.nextInt();
				
				// montar um for baseado no arraylist
				
					if(opcao != opcaoOld) {
						switch (opcao) {
						//Caso o usuário digite 1 a opção para dar Comida ao Monstrinho
						case 1:
							monstrinho.aplicarAcao(new Comida());
							break;
						//Caso o usuário digite 2 a opção para fazer o Monstrinho Malhar	
						case 2:
							monstrinho.aplicarAcao(new Malhacao());
							break;
						//Caso o usuário digite 3 a opção para fazer o Monstrinho descansar	
						case 3:
							monstrinho.aplicarAcao(new Descansar());
							break;
						//Caso o usuário digite 4 a opção para fazer o Monstrinho estudar	
						case 4:
							monstrinho.aplicarAcao(new Estudar());
							break;
						//Caso o usuário digite 5 a opção para fazer o Monstrinho trabalhar
						case 5:
							monstrinho.aplicarAcao(new Trabalhar());
							break;
						//Caso o usuário digite 6 a opção para fazer o Monstrinho se divertir
						case 6:
							monstrinho.aplicarAcao(new Diversao());
							break;
						//outro caso parar a aplicacao	
						default:
							break;
						}
					} else {
						System.out.println("\n");
						System.out.println("DIGITE OUTRA OPÇÃO. NÃO É PERMITIDO REPETIR A MESMA AÇÃO!!!");
						System.out.println("ATENÇÃO!!! SEU MONSTRINHO ESTÁ FICANDO ENTEDIADO!!! \n");
					  }				
				
				//status antes de passar o turno
				monstrinho.status();	
				
				//bonus
				monstrinho.bonus();	
				
				//loss
				monstrinho.loss();
				
				//status antes de passar o turno
				
				if(monstrinho.bonus()) {
				monstrinho.status();
				}
				
				if(monstrinho.loss()) {
					monstrinho.status();
					}
				
				//Executa a ação de passar turno onde o Monstrinho envelhece
				monstrinho.passarTurno();
				
				//Revela o status do Monstrinho após passar turno
				monstrinho.status();
				
				monstrinho.turno++;
				opcaoOld = opcao;
				
			}		
			
			//Os status do Monstrinho chegaram a zero
			System.out.println(monstrinho.nome + ", seu monstrinho Morreu...");
			System.out.println("Ele sobreviveu "+ monstrinho.turno + " turnos");
			System.out.println("Com a idade de " + monstrinho.idade + " anos\n");
			System.out.println("Sua pontuação foi: " + monstrinho.pontuacao() + " pontos\n");
					
			ranking.add(new Ranking(monstrinho.nome,monstrinho.pontuacao));
						
			//imprimindo o ranking
			System.out.println("RANKING \n");
			
			Collections.sort(ranking);
			
			ranking.forEach(rank -> {
				System.out.println(rank.nome +" "+ rank.pontuacao + " Pontos \n");
			});
						
			System.out.println("Gostaria de iniciar um novo jogo?");
			System.out.println("Digite 1 para sim");
			System.out.println("       0 para sair");
			
			encerrarJogo = teclado.nextInt();
			teclado.nextLine();
		}
		
		teclado.close();
		
		System.out.println("\n");
		System.out.println("FIM DO JOGO!!!");		
	}
	
}
