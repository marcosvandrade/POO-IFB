package restaurante;

public class Conta {
	private String codigo;
	private String nome;
	private Mesa[] mesas;
	private int maxMesas;
	private int qtd;
	
	public Conta(String codigo, String nome, int maxMesas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.mesas = new Mesa[maxMesas];
		this.maxMesas = maxMesas;
		this.qtd = 0;
	}
	
	public void adicionarMesa(Mesa mesa) {
		//if(mesa == mesas[mesa].getNumeroMesa()) {
		this.mesas[qtd] = mesa;
		qtd++;
		//}
	}
	
	public void removerMesa(String numeroMesa) {
		for (int i = 0; i < qtd; i++) {
			if (mesas[i].getNumeroMesa().contentEquals(numeroMesa)) {
				this.arrumarArray(i);
				return;
			}
		}
	}

	private void arrumarArray(int p) {
		for (int i = p; i < qtd-1; i++) {
			this.mesas[i] = this.mesas[i+1];
		}
		qtd--;
	}
	
	public void listarMesas() {
		System.out.println("Mesas ocupadas: ");
		for (int i = 0; i < qtd; i++) {
			System.out.println("- " + mesas[i].getNumeroMesa());
		}
	}
	
}
