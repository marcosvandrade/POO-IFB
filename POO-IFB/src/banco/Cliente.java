package banco;

public class Cliente {
	//Atributos
	String nome;
	String cpf;
	Conta conta;
	String endereco;
		
	Cliente(Conta conta){
		
	}
	
	//M�todos
	void atribuirConta(Conta c){
		conta = c;
	}
		
}
