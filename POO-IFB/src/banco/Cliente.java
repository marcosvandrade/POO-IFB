package banco;

public class Cliente {
	//Atributos
	String nome;
	String cpf;
	Conta conta;
	String endereco;
	
	//Métodos
	void atribuirConta(Conta c){
		conta = c;
	}
		
}
