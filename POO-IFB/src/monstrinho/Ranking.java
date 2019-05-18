package monstrinho;

public class Ranking extends Monstrinho implements Comparable<Ranking> {
	
	public Ranking(String nome, int pontuacao) {
		this.nome = nome;
		this.pontuacao = pontuacao;
	}

	@Override
	public int compareTo(Ranking outroRanking) {

		if (this.pontuacao > outroRanking.getPontuacao()) {
			return -1;
		}
		
		else if (this.pontuacao < outroRanking.getPontuacao()) {
			return 1;
		}
		
		return 0;
	}
		
}
