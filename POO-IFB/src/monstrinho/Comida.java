package monstrinho;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o Orientada a Objetos.
 *
 */
public class Comida extends Acao{

	public Comida(int id) {
		System.out.println("Hora da COMIDA!");
		
		this.saude += saude + 1;
		this.forca += forca + 1;
		this.energia += energia + 2;
	}
	
	
}
