package restaurante;

import java.util.Arrays;

//import exemploHeitorTurmaAluno.Aluno;

public class Mesa {
	private String numero;
	private boolean disponivel;
	private Mesa[] mesas;
	private int maxMesas;
	private int qtd;
	
	public Mesa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mesa(String numero, boolean disponivel, int maxMesas) {
		//super();
		this.numero = numero;
		this.disponivel = false;
		this.mesas = new Mesa[maxMesas];
		this.maxMesas = maxMesas;
		this.qtd = 0;
	}
	
	public void reservarMesa(Mesa mesa) {
		this.mesas[qtd] = mesa;
		qtd++;
	}
	
	public void removerMesa(String numero) {
		for (int i = 0; i < qtd; i++) {
			if(mesas[i].getNumero().equals(numero)){
				this.arrumarArray(i);
				return;
			}
		}
	}
	
	public void verificarDisponivel(String numero) {
		this.numero = numero;
		if(getDisponivel()) {
			System.out.println("A mesa " + getNumero() + " esta disponivel" );
		}else {
			System.out.println("INDISPONIVEL");
		}
	}
	
	private void arrumarArray(int p) {
		for (int i = p; i < qtd-1; i++) {
			this.mesas[i] = this.mesas[i+1];
		}
		qtd--;
	}
	
	public void listar() {
		System.out.println("Mesas disponiveis:");
		for (int i = 0; i < qtd; i++) {
			System.out.println("- " + mesas[i].getNumero() +" - "+ mesas[i].getDisponivel());
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Mesa[] getMesas() {
		return mesas;
	}

	public void setMesas(Mesa[] mesas) {
		this.mesas = mesas;
	}

	public int getMaxMesas() {
		return maxMesas;
	}

	public void setMaxMesas(int maxMesas) {
		this.maxMesas = maxMesas;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Mesa [numero=" + numero + ", disponivel=" + disponivel + ", mesas=" + Arrays.toString(mesas)
				+ ", maxMesas=" + maxMesas + ", qtd=" + qtd + "]";
	}
	
	

}
