package monstrinho;

import java.util.Scanner;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o Orientada a Objetos.
 *
 */

public class Jogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Monstrinho monstrinho = new Monstrinho();
		int opcao, turno = 1;
		
		System.out.println("Seu Monstrinho nasceu! \nCuide dele com carinho!\nN�o deixe seus status chegarem a zero");
		//Mostra o status do seu monstrinho
		monstrinho.status();
		//executa a repeti��o do jogo enquanto seu monstrinho est� vivo
		while(monstrinho.estaVivo()) {
			//Mostra as op��es e espera o jogador digitar sua escolha
			System.out.println("\n\n### TURNO "+turno+" ###");
			System.out.println("Escolha uma a��o: ");
			System.out.println("1- Comida (E+2 - F+0 - S+1)");
			System.out.println("2- Malha��o (E-2 - F+2 - S+1)");
			System.out.println("3- Descansar (E-1 - F+1 - S+1)");
			opcao = teclado.nextInt();
			
			//Caso o usu�rio digite 1 a op��o � dar Comida ao Monstrinho
			if(opcao == 1) {
				monstrinho.aplicarAcao(new Comida());
			}
			//Caso o usu�rio digite 2 a op��o � fazer o Monstrinho Malhar
			if (opcao == 2) {
				monstrinho.aplicarAcao(new Malhacao());
			}
			//Caso o usu�rio digite 3 a op��o � fazer o Monstrinho descansar
			if (opcao == 3) {
				monstrinho.aplicarAcao(new Descansar());
			}
			
			//Revela o status do Monstrinho
			monstrinho.status();
			//Executa a a��o de passar turno onde o Monstrinho envelhece
			monstrinho.passarTurno();
			//Revela o status do Monstrinho ap�s passar turno
			monstrinho.status();
			turno++;
		}		
		
		//Os status do Monstrinho chegaram a zero
		System.out.println("Seu monstrinho Morreu...");
		System.out.println("Ele sobreviveu "+ turno + " turnos");
		
		
		teclado.close();
	}
	
	
}
