package exemploCollections;

public class Aluno implements Comparable<Aluno>{

	private String nome;
	private String matricula;
	private String curso;
	
	public Aluno(String nome, String matricula, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno: " + nome ;
	}
	
	/**
	 * Sobrescrevendo o M�todo 'equals' da classe Object
	 * Verifica que um Aluno � igual ao outro com base na sua matr�cula
	 *  O uso do 'instanceof' serve para verificar que o objeto passado � do tipo Aluno
	 */
	@Override
	public boolean equals(Object outroAluno) {
		
		if(outroAluno instanceof Aluno) {
			if(this.getMatricula().equals(((Aluno) outroAluno).getMatricula())) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}

	/**
	 * O m�todo 'compareTo' � definido pela Interface Comparable e serve
	 * para comparar dois objetos. � utilizado como base para ordena��o de objetos
	 * Nesta implementa��o � utilizado o 'nome' do Aluno para definir a ordena��o. 
	 */
	@Override
	public int compareTo(Aluno outroAluno) {
		return this.getNome().compareToIgnoreCase(outroAluno.getNome());
	}

	
	/**
	 * o M�todo hashCode tem como objetivo gerar um n�mero �nico para o objeto.
	 * Nesta implementa��o o n�mero gerado tem como base a matr�cula do Aluno.
	 * Este m�todo � usado para verificar se um objeto est� inserido em um conjunto e
	 * evitar duplicatas.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		System.out.println(result);
		return result;
	}

}
