package exemploExceptions;
import java.util.Scanner;

public class Cadastro {
	
	public static void cadastro() throws EmailInvalidoException{
		String nome, email;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do usu�rio");
		nome = teclado.nextLine();
		System.out.println("Digite o email do usu�rio");
		email = teclado.nextLine();
		if(email.contains("@")) {
			System.out.println("Usu�rio cadastrado!");
		}else {
			throw new EmailInvalidoException();
		}
	}
	
	
	public static void main(String[] args) {
		try {
			cadastro();
		}catch(EmailInvalidoException e) {
			e.printStackTrace();
		}
		
	}

}
