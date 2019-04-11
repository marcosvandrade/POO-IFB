package exemploHeitorEmail.Aula;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas;
	private int notasInseridas;
	
	public Aluno(String nome, String matricula, int qtdNotas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		notas = new double[qtdNotas];
		notasInseridas = 0;
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

	public double[] getNotas() {
		return notas;
	}
	
	public void addNota(double  nota) {
		notas[notasInseridas] = nota;
		notasInseridas++;
	}
	
	public String toString(){
		String frase = "";
		frase+= "Aluno: "+this.getNome()+"\n";
		frase+= "Matricula: "+this.getMatricula()+"\n";
		frase+= "Notas:\n";
		for (int i = 0; i < notas.length; i++) {
			frase+= " - "+ notas[i]+"\n";
		}
		
		return frase;
	}
	

}
