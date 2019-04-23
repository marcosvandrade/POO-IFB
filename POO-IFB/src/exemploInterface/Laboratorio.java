package exemploInterface;

public class Laboratorio implements ICorpo{
	private String sala;
	private int qtdeComputadores;
	private boolean temInternet;
	
	public Laboratorio(String sala, int qtdeComputadores, boolean temInternet) {
		super();
		this.sala = sala;
		this.qtdeComputadores = qtdeComputadores;
		this.temInternet = temInternet;
	}

	@Override
	public String imprimeCorpo() {
		
		return this.toString();
	}

	@Override
	public String toString() {
		String msg = "Laboratorio " + sala + "\n quantidade de Computadores: " + qtdeComputadores +"\n";
		if(temInternet) {
			msg+="Laborat�rio com acesso a Internet\n";
		}else {
			msg+="Laborat�rio sem acesso a Internet";
		}
		
		return msg;
	}
	
	
	
	

}
