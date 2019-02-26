package banco;

public class Main {

	public static void main(String[] args) {
		Cliente fabio = new Cliente();
		fabio.nome = "Fabio F F";
		fabio.cpf = "095.341.323-69";
		
		Conta contaDoFabio = new Conta();
		contaDoFabio.saldo = 500.00;
		
		fabio.atribuirConta(contaDoFabio);
		
		fabio.conta.depositar(-200);
		
		System.out.println(fabio.conta.saldo());
	}
}