package restaurante;

public class Pedido {
			
	int idPedido;
	private Mesa mesa;
	private Produto produtos;
	
	public Pedido(int idPedido, Mesa mesa, Produto produtos) {
		//super();
		this.idPedido = idPedido;
		this.mesa = mesa;
		this.produtos = produtos;
	}

	public void removerPedido() {
		
	}
	
	public void consultarParcial() {
		
	}
	
	public void FecharConta() {
		
	}
	
}
