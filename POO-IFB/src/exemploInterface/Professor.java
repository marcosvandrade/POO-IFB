package exemploInterface;

public class Professor implements ICorpo{

	private String nome;
	private String siape;
	private String �rea;
	
	public Professor(String nome, String siape, String �rea) {
		super();
		this.nome = nome;
		this.siape = siape;
		this.�rea = �rea;
	}

	@Override
	public String imprimeCorpo() {
		
		return this.toString();
	}

	@Override
	public String toString() {
		return "Dados do Professor:\nNome:" + nome + "\nSiape:" + siape + "\n�rea:" + �rea + "\n";
	}
	
	
	
}
