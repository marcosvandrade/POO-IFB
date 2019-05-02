package monstrinho;

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
		
		while(encerrarJogo != 0) {
			
		Monstrinho monstrinho = new Monstrinho();
		int opcao = 0, opcaoOld = 0, turno = 1;
		
			System.out.println("Seu Monstrinho nasceu! Cuide dele com carinho! \n");
			System.out.println("Não deixe seus status chegarem a zero. \n");
			
			//Mostra o status do seu monstrinho
			monstrinho.status();
			//executa a repetição do jogo enquanto seu monstrinho está vivo
			while(monstrinho.estaVivo()) {
				
				//Mostra as opções e espera o jogador digitar sua escolha
				System.out.println("\n\n### TURNO "+turno+" ### \n");
				System.out.println("Escolha uma ação: \n");
				System.out.println("1- Comida    -> Saude   + 2");
				System.out.println("                Forca   + 2");
				System.out.println("                Energia + 3 \n");
				System.out.println("2- Malhação  -> Saude   + 3");
				System.out.println("                Forca   + 2");
				System.out.println("                Energia - 1 \n");
				System.out.println("3- Descansar -> Saude   + 2");
				System.out.println("                Forca   + 1");
				System.out.println("                Energia - 1 \n");
				System.out.println("4- Estudar   -> Saude   - 1");
				System.out.println("                Forca   - 1");
				System.out.println("                Energia - 1 \n");
				System.out.println("5- Trabalhar -> Saude   - 1");
				System.out.println("                Forca   - 2");
				System.out.println("                Energia - 1 \n");
				System.out.println("6- Diversao  -> Saude   + 3");
				System.out.println("                Forca   - 1");
				System.out.println("                Energia - 1");
				
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
						System.out.println("\n\n\n");
						System.out.println("DIGITE OUTRA OPÇÃO. NÃO É PERMITIDO REPETIR A MESMA AÇÃO!!! \n");
						System.out.println("ATENÇÃO!!! SEU MONSTRINHO ESTÁ FICANDO ENTEDIADO!!!");
						System.out.println("\n\n\n");
					  }				
								
				//Executa a ação de passar turno onde o Monstrinho envelhece
				monstrinho.passarTurno();
				
				//bonus
				monstrinho.bonus();	
				
				//loss
				monstrinho.loss();
				
				//Revela o status do Monstrinho após passar turno
				monstrinho.status();
				
				turno++;
				opcaoOld = opcao;
				
			}		
			
			//Os status do Monstrinho chegaram a zero
			System.out.println("\n\n\n");
			System.out.println("Seu monstrinho Morreu...\n");
			System.out.println("Ele sobreviveu "+ turno + " turnos\n");
			System.out.println("Com a idade de " + monstrinho.idade + " anos\n");
			
			System.out.println("\n\n\n");
			
			System.out.println("Gostaria de iniciar um novo jogo?");
			System.out.println("Digite 1 para sim");
			System.out.println("       0 para sair");
			
			System.out.println("\n\n\n\n\n\n\n\n\n");
			
			encerrarJogo = teclado.nextInt();
			
		}
		teclado.close();
		
		System.out.println("\n\n\n");
		System.out.println("FIM DO JOGO!!!");		
	}
	
}
