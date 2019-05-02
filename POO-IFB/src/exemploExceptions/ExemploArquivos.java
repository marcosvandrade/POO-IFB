package exemploExceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExemploArquivos {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do arquivo!");
		String arquivo = teclado.nextLine();
		try {
			Scanner leitor = new Scanner(new FileReader(arquivo));
			while(leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
			leitor.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo n�o encontrado!");
		} finally {
			teclado.close();

		}
		
	}
	
}
