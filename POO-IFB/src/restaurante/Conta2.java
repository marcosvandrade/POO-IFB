package restaurante;

public class Conta2 {
	private String codigo;
	private String nome;
	private Mesa2[] mesa2s;
	private int maxMesas;
	private int qtd;
	
	public Conta2(String codigo, String nome, int maxMesas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.mesa2s = new Mesa2[maxMesas];
		this.maxMesas = maxMesas;
		this.qtd = 0;
	}
	
	public void adicionarMesa(Mesa2 mesa2) {
		//if(mesa == mesa2s[mesa].getNumeroMesa()) {
		this.mesa2s[qtd] = mesa2;
		qtd++;
		//}
	}
	
	public void removerMesa(String numeroMesa) {
		for (int i = 0; i < qtd; i++) {
			if (mesa2s[i].getNumeroMesa().contentEquals(numeroMesa)) {
				this.arrumarArray(i);
				return;
			}
		}
	}

	private void arrumarArray(int p) {
		for (int i = p; i < qtd-1; i++) {
			this.mesa2s[i] = this.mesa2s[i+1];
		}
		qtd--;
	}
	
	public void listarMesas() {
		System.out.println("Mesas ocupadas: ");
		for (int i = 0; i < qtd; i++) {
			System.out.println("- " + mesa2s[i].getNumeroMesa());
		}
	}
	
}
