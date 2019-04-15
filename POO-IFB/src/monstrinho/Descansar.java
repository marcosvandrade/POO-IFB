package monstrinho;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programação Orientada a Objetos.
 *
 */
public class Descansar extends Acao{
	
	public Descansar() {
		System.out.println("Hora do soninho!");
		this.saude = 1;
		this.forca = 1;
		this.energia = -1;
	}
	

}
