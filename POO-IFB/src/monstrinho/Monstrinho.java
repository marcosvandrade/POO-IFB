package monstrinho;

/**
 * 
 * @author Heitor Barros
 * 
 * Jogo desenvolvido para o Estudo de Caso da disciplina de Programação Orientada a Objetos.
 *
 */
public class Monstrinho {

	String nome;
	int saude;
	int energia;
	int forca;
	int idade;
	int turno = 1;
	
	//Construtor da classe Monstrinho
	//Os atributos do Monstrinho iniciam com valor 5
	public Monstrinho(String nome) {
		this.saude = 5;
		this.energia = 5;
		this.forca = 5;
		this.idade = 1;
	}
	
	public Monstrinho() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ranking() {
		
		
			
	}
	
	
	public int pontuacao() {
		return idade * turno;
	}
		
	//bonus
	public boolean bonus() {
		
		//bonus de idade
		if(idade == 10) {
			this.energia += 1;
			System.out.println("BONUS!!!");
			System.out.println("Parabéns, você ganhou 1 ponto de ENERGIA!!! \n");
		}
		
		else if(idade == 19) {
			this.saude += 1;
			System.out.println("BONUS!!!");
			System.out.println("Parabéns, você ganhou 1 ponto de SAUDE!!! \n");
		}
		
		//bonus de saude
		else if((saude >= 15) && (saude <= 18)) {
			this.saude += 1;
			System.out.println("BONUS!!!");
			System.out.println("Parabéns, você ganhou 1 ponto de SAUDE!!! \n");
		}
		
		else if((saude == 1)) {
			this.saude += 4;
			System.out.println("BONUS!!!");
			System.out.println("Parabéns, você ganhou 4 pontos de SAUDE!!! \n");
		}
		
				
		//bonus de energia
		else if((energia >= 15) && (energia <= 18)) {
			this.energia += 1;
			System.out.println("BONUS!!!");
			System.out.println("Parabéns, você ganhou 1 ponto de ENERGIA!!! \n");
		}
		
		else if((energia == 2)) {
			this.energia += 3;
			System.out.println("BONUS!!!");
			System.out.println("Parabéns, você ganhou 3 pontos de ENERGIA!!! \n");
		}
		
		//bonus de força
		else if((forca >= 15) && (forca <= 18)) {
			this.forca += 1;
			System.out.println("BONUS!!!");
			System.out.println("Parabéns, você ganhou 1 ponto de FORÇA!!! \n");
		}
		
		else if((forca == 3)) {
			this.forca += 2;
			System.out.println("BONUS!!!");
			System.out.println("Parabéns, você ganhou 2 pontos de FORCA!!! \n");
		}
		else{
			return false;
		}
		
		return true;
	}
	
	//perdas (ARMADILHAS)
		public boolean loss() {
			
			//loss de idade
			if((idade > 10) && (idade < 20)) {
				this.energia -= 2;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!!");
				System.out.println("Você perdeu 2 pontos de ENERGIA!!! \n");
			}
			
			else if((idade > 35) && (idade < 40)) {
				this.saude -= 3;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!!");
				System.out.println("Você perdeu 3 pontos de SAUDE!!! \n");
			}
			
			else if((idade > 50) && (idade < 65)) {
				this.forca -= 4;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!!");
				System.out.println("Você perdeu 4 pontos de FORÇA!!! \n");
			}
			
			//loss de saude
			else if((saude >= 20) && (saude <= 25)) {
				this.saude -= 1;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!!");
				System.out.println("Você perdeu 1 ponto de SAUDE!!! \n");
			}
			
			else if((saude >= 40) && (saude <= 45)) {
				this.saude -= 3;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!!");
				System.out.println("Você perdeu 3 pontos de SAUDE!!! \n");
			}
			
			//loss de energia
			else if((energia >= 30) && (energia <= 35)) {
				this.energia -= 1;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!!");
				System.out.println("Você perdeu 1 ponto de ENERGIA!!! \n");
			}
			
			else if((energia >= 45) && (energia <= 50)) {
				this.energia -= 3;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!! \n");
				System.out.println("Você perdeu 3 pontos de ENERGIA!!! \n");
			}
			
			//loss de força
			else if((forca >= 50) && (forca <= 60)) {
				this.forca -= 1;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!!");
				System.out.println("Você perdeu 1 ponto de FORÇA!!! \n");
			}
					
			else if((forca >= 60) && (forca <= 65)) {
				this.forca -= 3;
				System.out.println("QUE PENA!!! VOCÊ CAIU NUMA ARMADILHA!!!");
				System.out.println("Você perdeu 3 pontos de FORÇA!!! \n");
			}
			
			else{
				return false;
			}
			
			return true;
			
		}
	
	public void passarTurno() {
		System.out.println("Seu monstrinho está ficando velho!");
		this.idade += 3;
		System.out.println("Ele está com " + idade + " ano(s)...");
		
		if((idade >= 1) && (idade <= 14)) {
			System.out.println("ELE AINDA É UMA CRIANÇA!!! \n");
		}
		
		if((idade >= 15) && (idade <= 24)) {
			System.out.println("ELE JÁ É UM JOVEM!!! \n");
		}
		
		if((idade >= 25) && (idade <= 64)) {
			System.out.println("PARABÉNS, ELE JÁ É UM ADULTO!!! \n");
		}
		
		if((idade >= 65)) {
			System.out.println("MITO!!! ELE É UM IDOSO!!! \n");
		}
		
		//A classe GeradorDeNumeros é utilizada para gerar um número aleatório
		//entre 0 e 2 para ser reduzido dos atributos do Monstrinho
		this.saude -= GeradorDeNumeros.gerar();
		this.energia -= GeradorDeNumeros.gerar();
		this.forca -= GeradorDeNumeros.gerar();
		
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
		System.out.println("\nDados do monstrinho: ");
		System.out.println("Idade -> " + this.idade + " ano(s)");
		System.out.println("Saúde -> " + this.saude);
		System.out.println("Energia -> " + this.energia);
		System.out.println("Força -> " + this.forca + "\n");
	}
	
}
