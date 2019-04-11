package exemploHeitorEmailMensageiro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Mensageiro m = new MensageiroPorEmail();
		System.out.println("Digite a mensagem:");
		String msg = teclado.nextLine();
		m.enviar(msg);
	}
	
}
