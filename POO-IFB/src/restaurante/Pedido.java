package restaurante;

public class Pedido {
			
	private Mesa mesa;
	private Produto produtos;
	
	public Pedido(Mesa mesa, Produto produtos) {
		//super();
		this.mesa = mesa;
		this.produtos = produtos;
	}

	
	
	public Mesa getMesa() {
		return mesa;
	}



	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}



	public Produto getProdutos() {
		return produtos;
	}



	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}



	public void removerPedido() {
		
	}
	
	public void consultarParcial() {
		
	}
	
	public void FecharConta() {
		
	}
	
}
