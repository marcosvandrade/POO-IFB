package restaurante;

import java.util.ArrayList;
import restaurante.Produto;

public class Cardapio {
		
	//criando os produtos
	ArrayList<Produto> produtos = new ArrayList<>();

	public Cardapio() {
		super();
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
	
	}
	
}
