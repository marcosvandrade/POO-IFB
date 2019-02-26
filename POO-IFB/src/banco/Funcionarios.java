package banco;

import java.util.Date;

public class Funcionarios {
	
	//atributos
	int codigo;
	String funcao;
	String dpto;
	String setor;
	String nome;
	Date dataAdmissao;
	Date dataExclusao;
	String endereco;
	String telefone;
	double salario;
	double comissao;
	boolean status;
	
	//metodos
	
	void pagarComissao() {
		
	}
	
	void pagarSalario() {
		
	}
	
	void estaAtivo() {
		
	}
	
	void criarConta() {
		
	}
	
	void fecharConta() {
		
	}
	
	void alterarLimite(Conta conta, double novolimite) {
		conta.mudalimite(novolimite);
	}
	
	void transferirConta() {
		
	}
	
}
