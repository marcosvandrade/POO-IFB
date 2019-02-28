package banco;

public class Cliente {
	//Atributos
	String nome;
	String cpf;
	Conta conta;
	String endereco;
		
	Cliente(Conta conta){
		
	}
	
	//Métodos
	void atribuirConta(Conta c){
		conta = c;
	}
		
}
