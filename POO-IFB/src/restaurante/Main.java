package restaurante;

import java.util.Scanner;

import restaurante.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int option = 1;
		Conta conta = new Conta("1","Marcos",10);
		while (option != 0) {
			System.out.println("Escolha uma opcao:");
			System.out.println("1 -  adicionar mesa");
			System.out.println("2 -  remover mesa");
			System.out.println("3 -  listar mesas");
			System.out.println("0 -  Encerrar programa");
			option = s.nextInt();
			s.nextLine();
			switch(option) {
			case 1:
				System.out.println("Digite o numero da mesa");
				String numeroMesa =  s.nextLine();
				Mesa novaMesa = new Mesa(numeroMesa);
				conta.adicionarMesa(novaMesa);
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
	
		}
		
		//criando os produtos
				Produto[] produtos = new Produto[20];
				//refeicoes
				produtos[0] = new Produto(1,"File de Frango",10.90);
				produtos[1] = new Produto(2,"File de Angus",12.90);
				produtos[2] = new Produto(3,"Parmegiana",16.90);
				produtos[3] = new Produto(4,"Picanha 120 gr",16.90);
				produtos[4] = new Produto(5,"Picanha 240 gr",24.90);
				//bebidas
				produtos[5] = new Produto(6,"Refrigerante 600ml",4.50);
				produtos[6] = new Produto(7,"Refrigerante 2 litros",7.50);
				produtos[7] = new Produto(8,"Refrigerante lata",3.50);
				produtos[8] = new Produto(9,"Agua 500ml",2.50);
				produtos[9] = new Produto(10,"Suco",4.50);
				//sobremesas
				produtos[10] = new Produto(11,"Torta de maca",18.00);
				produtos[11] = new Produto(12,"Salada de Frutas",15.00);
				produtos[12] = new Produto(13,"Pudim de doce de leite",15.00);
				produtos[13] = new Produto(14,"Cesta de Churros com sorvete de doce de leite",22.00);
				produtos[14] = new Produto(15,"Brownie de chocolate",18.00);
				
		s.close();
	}

}