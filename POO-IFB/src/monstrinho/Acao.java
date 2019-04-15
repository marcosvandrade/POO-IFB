package monstrinho;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programa��o Orientada a Objetos.
 *
 *Esta classe representa uma a��o gen�rica.
 *
 */
public class Acao {
	
	int energia;
	int forca;
	int saude;
	
	public Acao() {
		energia = 0;
		forca = 0;
		saude = 0;
	}

	public int getEnergia() {
		return energia;
	}

	public int getForca() {
		return forca;
	}

	public int getSaude() {
		return saude;
	}
	
	
	

}
