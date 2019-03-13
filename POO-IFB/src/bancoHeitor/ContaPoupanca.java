package bancoHeitor;


public class ContaPoupanca extends Conta {
		
	public ContaPoupanca(String numero) {
		super(numero);
	}
		
	public void render() {
		this.saldo += (this.saldo * 0.01);
	}
}
