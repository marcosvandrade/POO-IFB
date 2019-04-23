package monstrinho;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programação Orientada a Objetos.
 *
 */
public class Monstrinho {

	int saude;
	int energia;
	int forca;
	
	//Construtor da classe Monstrinho
	//Os atributos do Monstrinho iniciam com valor 5
	public Monstrinho() {
		this.saude = 5;
		this.energia = 5;
		this.forca = 5;
	}
	
	public void passarTurno() {
		System.out.println("Seu monstrinho está ficando velho!");
		//A classe GeradorDeNumeros � utilizada para gerar um n�mero aleat�rio
		//entre 0 e 2 para ser reduzido dos atributos do Monstrinho
		this.saude -= GeradorDeNumeros.gerar();
		this.energia -= GeradorDeNumeros.gerar();
		this.forca -= GeradorDeNumeros.gerar();
	}
	
	public void aplicarAcao(Acao acao) {
		//Ao aplicar uma Ação no monstrinho, seus atributos aumentam
		//de acordo com os atributos da a��o empregada
		this.saude += acao.getSaude();
		this.forca += acao.getForca();
		this.energia += acao.getEnergia();
	}
	
	public boolean estaVivo() {
		//Este m�todo retorna verdadeiro quando todos os atributos do
		//Monstrinho forem maiores que zero. Caso um dos atributos seja
		//menor ou igual a zero este m�todo retorna falso.
		return (this.saude > 0 && this.energia > 0 && this.forca> 0);
	}
	
	public void status() {
		//Este m�todo imprime os valores dos atributos do Monstrinho
		System.out.println("Dados do monstrinho:");
		System.out.println("Sa�de -> " + this.saude);
		System.out.println("Energia -> " + this.energia);
		System.out.println("For�a -> " + this.forca);
	}
	
}
