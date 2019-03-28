package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {

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
		//mesas.forEach(mesa -> {System.out.println("Mesa: " + mesa.getNrMesa() + " Disponivel: " + mesa.getDisponivel() + "\n");});
				
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
				
		//System.out.println(cardapio.toString());
		//produtos.forEach(produto -> {System.out.println("Produto: " + produto.getNome() + "\nPreco: " + produto.getPreco() + "\n");});
		
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
				//mesas.forEach(mesa -> {System.out.println("Mesa: " + mesa.getNrMesa() + " Disponivel: " + mesa.getDisponivel() + "\n");});
				
				
				
				
				break;
			case 2:
				//TODO
				break;
			case 3:
				//TODO
				break;
			case 4:
				//TODO
				break;
			case 5:
				//TODO
				break;
			case 0:
				//TODO
				break;
			}
	
		}
		
						
		s.close();
	}

}
