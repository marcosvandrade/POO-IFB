package banco;

public class Conta {
	// Atributos - Variáveis
	double saldo;
	String numero;
	String tipo;
	boolean ativa;
	double limite;
	
	// Métodos - Funções
	double saldo(){
		return saldo;
	}
	
	void sacar(double valor){
		if (verificaSaldo(valor)) {
			saldo = saldo - valor;
		}else {
			System.err.println("Saldo insuficiente");
		}
	}
	
	void depositar(double valor){
		if(valor <= 0) {
			return;
		}		
		saldo = saldo + valor;
	}
	
	void transferencia(double valor, Conta outraConta) {
		if (verificaSaldo(valor)) {
			saldo = saldo - valor;
			outraConta.depositar(valor);
		}else {
			System.err.println("Saldo insuficiente");
		}
	}
	
	boolean verificaSaldo(double valor) {
		if(valor <= 0) {
			return false;
		}
		if (valor > saldo + limite) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
				
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
				
		conta1.numero = "2393-3";
		conta1.saldo = 340.00;
		conta1.tipo = "conta corrente";
		conta1.ativa = true;
		conta1.limite = 200.00;
		
		
		conta2.saldo = 200.00;
		System.out.println("Conta 1 - "+conta1.saldo());
		System.out.println("Conta 2 - "+conta2.saldo());
		
		
		conta1.transferencia(100.00, conta2);
		
		System.out.println("Conta 1 - "+conta1.saldo());
		System.out.println("Conta 2 - "+conta2.saldo());
		//conta1.sacar(1000.00);
				
		
	}

	public void mudalimite(double novolimite) {
		limite = novolimite;
		
	}
	
}