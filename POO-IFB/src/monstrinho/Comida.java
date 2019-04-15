package monstrinho;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programação Orientada a Objetos.
 *
 */
public class Comida extends Acao{

	public Comida() {
		System.out.println("Hora da COMIDA!");
		super.energia = 2;
		super.forca = 0;
		super.saude = 1;
	}
	
	
}
