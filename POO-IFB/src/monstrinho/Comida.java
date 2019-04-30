package monstrinho;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o Orientada a Objetos.
 *
 */

public class Comida extends Acao{

	public Comida() {
		System.out.println("Hora da COMIDA! \n");
		
		this.saude = 1;
		this.forca = 0;
		this.energia = 3;
		
	}
	
}
