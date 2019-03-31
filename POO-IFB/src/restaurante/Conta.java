package restaurante;

public class Conta {
	private Mesa mesa;
	private Produto produto;
	private double totalParcial;
	
	
	public Conta(Mesa mesa, Produto produto, double totalParcial) {
	//	super();
		this.mesa = mesa;
		this.produto = produto;
		this.totalParcial = totalParcial;
	}
	
	public Mesa getMesa() {
		return mesa;
	}


	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getTotalParcial() {
		return totalParcial;
	}

	public void setTotalParcial(double totalParcial) {
		this.totalParcial = totalParcial;
	}

	@Override
	public String toString() {
		return "Conta [mesa=" + mesa + ", produto=" + produto + ", totalParcial=" + totalParcial + "]";
	}

}