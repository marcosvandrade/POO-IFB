package bancoHeitor;


public class ContaCorrente extends Conta{
	private double limite;
	private double taxaDeManutencao;
	
	public ContaCorrente(String numero, double limite, double taxa) {
		super(numero);
		this.limite = limite;
		this.taxaDeManutencao = taxa;
	}
	
	public void pagarManutencao() {
		this.saldo -= taxaDeManutencao;
	}
	
	public void sacar(double valor) {
		System.out.println("Sacando da Conta2 Corrente");
		if(valor > 0 && (saldo + limite > valor)) {
			this.saldo -= valor;
		}else {
			System.err.println("Saque inv�lido!\n Valor maior que o limite!");
		}
	}
	
}
