package restaurante;

public class Mesa {
	
	private int nrMesa;
	private boolean disponivel;
	
	public Mesa(int nrMesa) {
		super();
		this.nrMesa = nrMesa;
		this.disponivel = true;
	}
		
	public int getNrMesa() {
		return this.nrMesa;
	}

	public void setNrMesa(int nrMesa) {
		this.nrMesa = nrMesa;
	}

	public boolean getDisponivel() {
		if(disponivel == true) {
			System.out.println("Disponivel");;
		}else{
			System.out.println("Indisponivel");
		}
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
		
}
		

