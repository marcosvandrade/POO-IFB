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
	int idade;
	
	//Construtor da classe Monstrinho
	//Os atributos do Monstrinho iniciam com valor 5
	public Monstrinho() {
		this.saude = 5;
		this.energia = 5;
		this.forca = 5;
		this.idade = 1;
	}
	
	public void passarTurno() {
		System.out.println("Seu monstrinho está ficando velho!\n");
		System.out.println("Ele está com " + idade + " anos...");
		//A classe GeradorDeNumeros é utilizada para gerar um número aleatório
		//entre 0 e 2 para ser reduzido dos atributos do Monstrinho
		this.saude -= GeradorDeNumeros.gerar();
		this.energia -= GeradorDeNumeros.gerar();
		this.forca -= GeradorDeNumeros.gerar();
		this.idade += idade + 5;
	}
	
	public void aplicarAcao(Acao acao) {
		//Ao aplicar uma Ação no monstrinho, seus atributos aumentam
		//de acordo com os atributos da ação empregada
		this.saude += acao.getSaude();
		this.forca += acao.getForca();
		this.energia += acao.getEnergia();
	}
	
	public boolean estaVivo() {
		//Este método retorna verdadeiro quando todos os atributos do
		//Monstrinho forem maiores que zero. Caso um dos atributos seja
		//menor ou igual a zero este método retorna falso.
		return (this.saude > 0 && this.energia > 0 && this.forca> 0);
	}
	
	public void status() {
		//Este método imprime os valores dos atributos do Monstrinho
		System.out.println("Dados do monstrinho:");
		System.out.println("Saúde -> " + this.saude);
		System.out.println("Energia -> " + this.energia);
		System.out.println("Força -> " + this.forca);
	}
	
}
