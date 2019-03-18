package restaurante;

public class Produto extends Pedido {
		
	private int codigo;
	private String nome;
	private double preco;
		
	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public void sobremesaGratis() {
		
	}
	
	public void happyHour() {
		
	}
	
}
