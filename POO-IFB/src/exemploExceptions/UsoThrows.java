package exemploExceptions;
import java.util.Scanner;

public class UsoThrows {
	
	public static int dividir(int a, int b) throws ArithmeticException{
		return a / b;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 2 n�meros:");
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		int resultado;
		try {
			resultado = dividir(x, y);
		}catch(ArithmeticException e) {
			System.out.println("N�o pode dividir por zero");
			resultado = 1;
		}
		System.out.println(resultado);
		
	}
}
