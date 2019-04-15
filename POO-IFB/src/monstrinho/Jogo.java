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
		
		System.out.println("Seu Monstrinho nasceu! \nCuide dele com carinho!\nNão deixe seus status chegarem a zero");
		//Mostra o status do seu monstrinho
		monstrinho.status();
		//executa a repetição do jogo enquanto seu monstrinho está vivo
		while(monstrinho.estaVivo()) {
			//Mostra as opções e espera o jogador digitar sua escolha
			System.out.println("\n\n### TURNO "+turno+" ###");
			System.out.println("Escolha uma ação: ");
			System.out.println("1- Comida (E+2 - F+0 - S+1)");
			System.out.println("2- Malhação (E-2 - F+2 - S+1)");
			System.out.println("3- Descansar (E-1 - F+1 - S+1)");
			opcao = teclado.nextInt();
			
			//Caso o usuário digite 1 a opção é dar Comida ao Monstrinho
			if(opcao == 1) {
				monstrinho.aplicarAcao(new Comida());
			}
			//Caso o usuário digite 2 a opção é fazer o Monstrinho Malhar
			if (opcao == 2) {
				monstrinho.aplicarAcao(new Malhacao());
			}
			//Caso o usuário digite 3 a opção é fazer o Monstrinho descansar
			if (opcao == 3) {
				monstrinho.aplicarAcao(new Descansar());
			}
			
			//Revela o status do Monstrinho
			monstrinho.status();
			//Executa a ação de passar turno onde o Monstrinho envelhece
			monstrinho.passarTurno();
			//Revela o status do Monstrinho após passar turno
			monstrinho.status();
			turno++;
		}		
		
		//Os status do Monstrinho chegaram a zero
		System.out.println("Seu monstrinho Morreu...");
		System.out.println("Ele sobreviveu "+ turno + " turnos");
		
		
		teclado.close();
	}
	
	
}
