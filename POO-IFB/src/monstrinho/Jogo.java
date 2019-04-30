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
		Scanner teclado = new Scanner(System.in);
		Monstrinho monstrinho = new Monstrinho();
		int opcao, turno = 1;
		
		System.out.println("Seu Monstrinho nasceu! \n");
		System.out.println("Cuide dele com carinho! \n");
		System.out.println("Não deixe seus status chegarem a zero. \n");
		
		//Mostra o status do seu monstrinho
		monstrinho.status();
		//executa a repetição do jogo enquanto seu monstrinho está vivo
		while(monstrinho.estaVivo()) {
			
			//Mostra as opções e espera o jogador digitar sua escolha
			System.out.println("\n\n### TURNO "+turno+" ### \n");
			System.out.println("Escolha uma ação: \n");
			System.out.println("1- Comida (E+2 - F+0 - S+1)");
			System.out.println("2- Malhação (E-2 - F+2 - S+1)");
			System.out.println("3- Descansar (E-1 - F+1 - S+1)");
			System.out.println("4- Estudar (E-1 - F+1 - S+1)");
			System.out.println("5- Trabalhar (E-2 - F-2 - S-1)");
			System.out.println("6- Diversao (E-1 - F-2 - S+2)");
						
			opcao = teclado.nextInt();
			
			// montar um for baseado no arraylist
			
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
								
			//Executa a ação de passar turno onde o Monstrinho envelhece
			monstrinho.passarTurno();
			//Revela o status do Monstrinho após passar turno
			monstrinho.status();
			turno++;
			
		}		
		
		//Os status do Monstrinho chegaram a zero
		System.out.println("Seu monstrinho Morreu...\n");
		System.out.println("Ele sobreviveu "+ turno + " turnos\n");
		System.out.println("Com a idade de " + monstrinho.idade + " anos\n");
		
		
		teclado.close();
	}
	
	
}
