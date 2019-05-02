package exemploExceptions;
import java.util.Scanner;

public class UsoTryCatch {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean deuCerto;
		do {
			deuCerto = true;
			System.out.println("Digite 2 n�meros:");
			int x = teclado.nextInt();
			int y = teclado.nextInt();
			
			try {
				System.out.println(x / y);
			}catch(ArithmeticException ae) {
				System.out.println("N�o � poss�vel dividir por zero");
				System.out.println("Tente novamente");
				deuCerto = false;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Voc� tentou acessar um �ndice inv�lido!");
				deuCerto = false;
			}finally {
				System.out.println("entrou no finally");
				teclado.close();
			}
		}while(deuCerto != true);
 		
		
		
	}

}
