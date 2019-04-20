package exemploInterface;

public class Professor implements ICorpo{

	private String nome;
	private String siape;
	private String area;
	
	public Professor(String nome, String siape, String area) {
		super();
		this.nome = nome;
		this.siape = siape;
		this.area = area;
	}

	@Override
	public String imprimeCorpo() {
		
		return this.toString();
	}

	@Override
	public String toString() {
		return "Dados do Professor:\nNome:" + nome + "\nSiape:" + siape + "\nï¿½rea:" + area + "\n";
	}
	
	
	
}
