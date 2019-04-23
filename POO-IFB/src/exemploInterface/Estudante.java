package exemploInterface;

public class Estudante implements ICorpo{
	
	private String nome;
	private String matricula;
	private String curso;
	private int anoNascimento;
	
	public Estudante(String nome, String matricula, String curso, int ano) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.anoNascimento = ano;
	}

	@Override
	public String imprimeCorpo() {
		return this.toString()+"\n";
	}

	@Override
	public String toString() {
		return "Dados do estudante \nNome:" + nome + "\nMatr�cula:" + matricula + "\nCurso:" + curso + "\nAno de Nascimento:" + anoNascimento + "";
	}
	
	
	
	

}
