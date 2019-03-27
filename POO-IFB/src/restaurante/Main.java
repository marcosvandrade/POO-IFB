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
		
		
				
		s.close();
	}

}
