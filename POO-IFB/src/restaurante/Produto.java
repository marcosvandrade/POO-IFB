package restaurante;

public class Produto {
	
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
	
		@Override
		public String toString() {
			return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
		}
	
}