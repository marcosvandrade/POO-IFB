package monstrinho;

import exemploCollections.Aluno;

public class Ranking extends Monstrinho implements Comparable<Ranking> {
	
	public Ranking(String nome, int pontuacao) {
		this.nome = nome;
		this.pontuacao = pontuacao;
	}

	@Override
	public int compareTo(Ranking o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
//	@Override
//	public String toString() {
//		return "Ranking [" + nome + "=" + getPontuacao() + "]";
//	}
//	
	
	
}
