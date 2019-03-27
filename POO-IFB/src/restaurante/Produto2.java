package restaurante;

import java.util.ArrayList;
import java.util.List;

public class Produto {
			
		private int codigo;
		private String nome;
		private double preco;
		
		public Produto(int codigo, String nome, double preco) {
			this.codigo = codigo;
			this.nome = nome;
			this.preco = preco;
		}
		
		public void listarProdutos() {
			
		}
		
		public void sobremesaGratis() {
			
		}
		
		public void happyHour() {
			
		}
					
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		@Override
		public String toString() {
			return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
		}
		
	/*
	 * public void ArrayList() {
	 * 
	 * //criando os produtos List<Produto> produtos = new ArrayList<Produto>();
	 * //refeicoes produtos.add(new Produto(1,"File de Frango",10.90));
	 * produtos.add(new Produto(2,"File de Angus",12.90)); produtos.add(new
	 * Produto(3,"Parmegiana",16.90)); produtos.add(new
	 * Produto(5,"Picanha 240 gr",24.90)); //bebidas produtos.add(new
	 * Produto(6,"Refrigerante 600ml",4.50)); produtos.add(new
	 * Produto(7,"Refrigerante 2 litros",7.50)); produtos.add(new
	 * Produto(8,"Refrigerante lata",3.50)); produtos.add(new
	 * Produto(9,"Agua 500ml",2.50)); produtos.add(new Produto(10,"Suco",4.50));
	 * //sobremesas produtos.add(new Produto(11,"Torta de maca",18.00));
	 * produtos.add(new Produto(12,"Salada de Frutas",15.00)); produtos.add(new
	 * Produto(13,"Pudim de doce de leite",15.00)); produtos.add(new
	 * Produto(14,"Cesta de Churros com sorvete de doce de leite",22.00));
	 * produtos.add(new Produto(15,"Brownie de chocolate",18.00));
	 * 
	 * produtos.forEach(produto -> {System.out.println("Produto: " +
	 * produto.getNome() + "\nPreco: " + produto.getPreco() + "\n");});
	 * //System.out.println(" Prato: " + produtos.get(0).getNome() + "\n Preco: " +
	 * produtos.get(0).getPreco());
	 * 
	 * }
	 */
}
			
					
			
		
			

