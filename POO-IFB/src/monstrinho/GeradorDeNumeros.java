package monstrinho;

import java.util.Random;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programaçãoo Orientada a Objetos.
 *
 */

public class GeradorDeNumeros {

	public static int gerar() {
		Random r = new Random();
		return r.nextInt(4); // gera números randômicos entre 0 e 3
	}
	
	public static void main(String[] args) {
		System.out.println(GeradorDeNumeros.gerar());
	}
	
}
