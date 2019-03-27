package restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import restaurante.Produto2;

public class Main2 {
		
	public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
		int option = 1;
		Conta conta = new Conta("1","Marcos",10);
		while (option != 0) {
			
			//criando os produtos
			List<Produto2> produto2s = new ArrayList<Produto2>();
			//refeicoes
			produto2s.add(new Produto2(1,"File de Frango",10.90));
			produto2s.add(new Produto2(2,"File de Angus",12.90));
			produto2s.add(new Produto2(3,"Parmegiana",16.90));
			produto2s.add(new Produto2(5,"Picanha 240 gr",24.90));
			//bebidas
			produto2s.add(new Produto2(6,"Refrigerante 600ml",4.50));
			produto2s.add(new Produto2(7,"Refrigerante 2 litros",7.50));
			produto2s.add(new Produto2(8,"Refrigerante lata",3.50));
			produto2s.add(new Produto2(9,"Agua 500ml",2.50));
			produto2s.add(new Produto2(10,"Suco",4.50));
			//sobremesas
			produto2s.add(new Produto2(11,"Torta de maca",18.00));
			produto2s.add(new Produto2(12,"Salada de Frutas",15.00));
			produto2s.add(new Produto2(13,"Pudim de doce de leite",15.00));
			produto2s.add(new Produto2(14,"Cesta de Churros com sorvete de doce de leite",22.00));
			produto2s.add(new Produto2(15,"Brownie de chocolate",18.00));
			
			System.out.println("Escolha uma opcao:");
			System.out.println("1 -  Adicionar Pedido");
			System.out.println("2 -  remover mesa");
			System.out.println("3 -  listar mesas");
			System.out.println("0 -  Encerrar programa");
			option = s.nextInt();
			s.nextLine();
			
			switch(option) {
			case 1://adicionando o pedido
				//reservando a  mesa
				System.out.println("Digite o numero da mesa");
				String numeroMesa =  s.nextLine();
				Mesa novaMesa = new Mesa(numeroMesa);
				conta.adicionarMesa(novaMesa);
				//Mostrando o menu
				//produtos.forEach(produto -> {System.out.println("Produto2: " + produto.getNome() + "\nPreco: " + produto.getPreco() + "\n");});
				
				
				
				
				
				
				break;
			case 2:
				System.out.println("Digite o numero da mesa:");
				String mesa = s.nextLine();
				conta.removerMesa(mesa);
				break;
			case 3:
				conta.listarMesas();
				break;
			}
						
			
				 
			//produtos.forEach(produto -> {System.out.println("Produto2: " + produto.getNome() + "\nPreco: " + produto.getPreco() + "\n");});
			//System.out.println(" Prato: " + produtos.get(0).getNome() + "\n Preco: " + produtos.get(0).getPreco());
				
		}
			
		s.close();
		
	}
	
	
}
