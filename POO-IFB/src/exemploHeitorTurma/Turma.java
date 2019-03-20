package exemploHeitorTurma;

public class Turma {
	private String codigo;
	private String nome;
	private Aluno[] alunos;
	private int maxAlunos;
	private int qtd;
	
	public Turma(String codigo, String nome, int maxAlunos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.alunos = new Aluno[maxAlunos];
		this.maxAlunos = maxAlunos;
		this.qtd = 0;
	}
	
	public void adicionar(Aluno aluno) {
		this.alunos[qtd] = aluno;
		qtd++;
	}
	
	public void remover(String matricula) {
		for (int i = 0; i < qtd; i++) {
			if(alunos[i].getMatricula().equals(matricula)){
				this.arrumarArray(i);
				return;
			}
		}
	}
	
	private void arrumarArray(int p) {
		for (int i = p; i < qtd-1; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		qtd--;
	}
	
	public void listar() {
		System.out.println("Alunos matriculados:");
		for (int i = 0; i < qtd; i++) {
			System.out.println("- "+alunos[i].getMatricula()+" - "+alunos[i].getNome());
		}
	}
	
	

}
