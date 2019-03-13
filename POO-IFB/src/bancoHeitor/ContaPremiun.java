package bancoHeitor;

import java.util.Random;

public class ContaPremiun extends ContaCorrente{

	public ContaPremiun(String numero, double limite, double taxa) {
		super(numero, limite, taxa);
	}
	
	private void sorteio() {
		Random geradorAleatorio = new Random();
		int numeroGerado = geradorAleatorio.nextInt(100);
		if(numeroGerado < 2) {
			System.out.println("VOC� FOI SORTEADO!");
			this.depositar(300.00);
		}else {
			System.out.println("N�o foi dessa vez...");
		}
	}
	
	public void depositar(double valor) {
		if(valor > 0) {			
			this.saldo += valor;
			if(valor> 100.00) {
				this.sorteio();
			}			
		}
	}

}
