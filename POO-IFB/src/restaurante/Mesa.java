package restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mesa {
	
	private int nrMesa;
	private boolean disponivel;
	private List<Produto> produtos;
	double totalParcial = 0;
	
	public Mesa(int nrMesa) {
		super();
		this.nrMesa = nrMesa;
		this.disponivel = true;
		produtos = new ArrayList<>();
	}
		
	public int getNrMesa() {
		return this.nrMesa;
	}

	public void setNrMesa(int nrMesa) {
		this.nrMesa = nrMesa;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void adicionarProdutos(List<Produto> prods) {
		 
		System.out.println("\nDigite o codigo do produto que deseja escolher: ");
		Scanner s = new Scanner(System.in);
		int produtoEscolha = s.nextInt();
		s.nextLine();
		Produto produtoEscolhido = prods.get(produtoEscolha-1);
		
//		System.out.println("Mesa "+getNrMesa()+" --> Pedido: "
//				+"ID "+produtoEscolhido.getCodigo()+" - "
//				+produtoEscolhido.getNome()+" - Preco R$ "
//				+produtoEscolhido.getPreco());
					
		produtos.add(produtoEscolhido);
		
		System.out.println("\n");
		
		listarProdutos();
		
		System.out.println("\n");
		
	}
	
	public void listarProdutos() {
		
		System.out.println("Produtos escolhidos ate o momento: \n");
		
		produtos.forEach(prod -> {
			
			System.out.print("Mesa "+getNrMesa()+" --> Pedido: "+"ID "
							   + prod.getCodigo()+" - "+prod.getNome());
			
			System.out.printf(" - Preco R$ %.2f %n", prod.getPreco());});
	}
	
	public void totalParcial() {
		produtos.forEach(total ->{
			totalParcial = totalParcial + total.getPreco();
		});
		System.out.printf("TOTAL PARCIAL ate o momento: R$ %.2f %n",totalParcial);
	}
	

}
		

