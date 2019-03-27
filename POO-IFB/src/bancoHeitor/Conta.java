package bancoHeitor;


public class Conta {
	protected double saldo;
	private String numero;
	private boolean ativa;
	public Conta(String numero) {
		super();
		this.saldo = 0.0;
		this.numero = numero;
		this.ativa = true;
	}
	public void depositar(double valor) {
		if(valor > 0) {			this.saldo += valor;		}
	}
	
	public double verSaldo() {
		return this.saldo;
	}
	
	public void sacar(double valor) {
		System.out.println("Sacando da Conta2");
		if(valor > 0 && (saldo > valor)) {
			this.saldo -= valor;
		}else{
			System.err.println("Saque inv�lido!\n Saldo insuficiente!");
		}
	}
}
