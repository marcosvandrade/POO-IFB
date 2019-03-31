package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Restaurante {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int option = 1;
		
		//criando as mesas
		ArrayList<Mesa> mesas = new ArrayList<>();
		mesas.add(new Mesa(1));
		mesas.add(new Mesa(2));
		mesas.add(new Mesa(3));
		mesas.add(new Mesa(4));
		mesas.add(new Mesa(5));
		mesas.add(new Mesa(6));
		mesas.add(new Mesa(7));
		mesas.add(new Mesa(8));
		mesas.add(new Mesa(9));
		mesas.add(new Mesa(10));
		
		//criando os produtos
		ArrayList<Produto> produtos = new ArrayList<>();
		
		//refeicoes
		produtos.add(new Produto(1,"File de Frango",10.90));
		produtos.add(new Produto(2,"File de Angus",12.90));
		produtos.add(new Produto(3,"Parmegiana",16.90));
		produtos.add(new Produto(4,"Picanha 120 gr",16.90));
		produtos.add(new Produto(5,"Picanha 240 gr",24.90));
		
		//bebidas
		produtos.add(new Produto(6,"Refrigerante 600ml",4.50));
		produtos.add(new Produto(7,"Refrigerante 2 litros",7.50));
		produtos.add(new Produto(8,"Refrigerante lata",3.50));
		produtos.add(new Produto(9,"Agua 500ml",2.50));
		produtos.add(new Produto(10,"Suco",4.50));
		
		//sobremesas
		produtos.add(new Produto(11,"Torta de maca",18.00));
		produtos.add(new Produto(12,"Salada de Frutas",15.00));
		produtos.add(new Produto(13,"Pudim de doce de leite",15.00));
		produtos.add(new Produto(14,"Cesta de Churros com sorvete de doce de leite",22.00));
		produtos.add(new Produto(15,"Brownie de chocolate",18.00));
				
		
		//Pedidos
		while (option != 0) {
			System.out.println("Escolha uma opcao:\n");
			System.out.println("1 -  Realizar o pedido");
			System.out.println("2 -  listar as mesas disponiveis");
			System.out.println("3 -  Remover o pedido");
			System.out.println("4 -  Consultar Parcial");
			System.out.println("5 -  Fechar a conta");
			System.out.println("0 -  Encerrar programa");
			option = s.nextInt();
			s.nextLine();
						
			switch(option) {
			
			//realizar pedido
			case 1:
				
				//listando as mesas disponiveis
				System.out.println("Qual mesa gostaria de reservar?\n");				
				mesas.forEach(mesa -> {
					System.out.print(mesa.getNrMesa() );
					boolean disponivel = mesa.getDisponivel();
					if(disponivel) {
						System.out.println(" esta Disponivel \n");						
					}else{
						System.out.println(" ENCONTRA-SE INDISPONIVEL!!! \n");
					}
					
				});
				
				//reservando a mesa escolhida
				int escolha = s.nextInt();
				s.nextLine();
				
				Mesa mesaEscolhida = mesas.get(escolha-1);//o -1 eh pq o array comeca na posicao 0
				mesaEscolhida.setDisponivel(false);
				//listando a mesa escolhida
				System.out.println("A mesa reservada foi a numero "+mesaEscolhida.getNrMesa());

				//escolhendo o produto
								
				int option2 = 1;
								
				while(option2 != 0) {
				
				System.out.println("\nGostaria de escolher um produto?");
				System.out.println("digite 1 para sim");
				System.out.println("       0 para sair");
				
				option2 = s.nextInt();
				s.nextLine();
				
					if(option2 == 1) {	
					//listando o cardapio
					produtos.forEach(produto -> {
						System.out.println("ID: "+produto.getCodigo()+" Produto: "+produto.getNome()
											+" Preco R$ "+produto.getPreco()+"\n");});	
										
					mesaEscolhida.adicionarProdutos(produtos);
						
					}
				}
				break;
			case 2:
				//listando as mesas disponiveis
				System.out.println("Qual mesa gostaria de reservar?\n");
				mesas.forEach(mesa -> {
					System.out.print(mesa.getNrMesa() );
					boolean disponivel = mesa.getDisponivel();
					if(disponivel) {
						System.out.println(" esta Disponivel \n");						
					}else{
						System.out.println(" ENCONTRA-SE INDISPONIVEL!!! \n");
					}
					
				});
				break;
			case 3:
				//TODO
				break;
			case 4:
				System.out.println("Qual mesa gostaria de ver parcial?\n");				
				mesas.forEach(mesa -> {
					System.out.print(mesa.getNrMesa() );
					boolean disponivel = mesa.getDisponivel();
					if(disponivel) {
						System.out.println(" esta Disponivel \n");						
					}else{
						System.out.println(" ENCONTRA-SE INDISPONIVEL!!! \n");
					}
					
				});
				
				//reservando a mesa escolhida
				escolha = s.nextInt();
	
				mesaEscolhida = mesas.get(escolha-1);

				System.out.println("Conta parcial ate o momento :");
				mesaEscolhida.listarProdutos();
				mesaEscolhida.totalParcial();
				
				break;
			case 5:
				//TODO
				break;
			case 0:
				break;
			}
	
		}
					
		s.close();
		
		
	}

}
