package bancoHeitor;


public class Principal {

	public static void main(String[] args) {
		ContaPremiun cp = new ContaPremiun("43142-2", 500.00, 35.00);
		
		cp.depositar(200.00);
		cp.depositar(200.00);
		cp.depositar(200.00);
		cp.depositar(200.00);
		cp.depositar(200.00);
		cp.depositar(200.00);
		cp.depositar(200.00);
		cp.depositar(200.00);
		cp.depositar(200.00);
		cp.depositar(200.00);
		
		System.out.println(cp.verSaldo());
		
		
		
		

	}

}
