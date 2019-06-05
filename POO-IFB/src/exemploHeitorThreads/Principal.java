package exemploHeitorThreads;


	import java.util.Scanner;

	public class Principal {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Labirinto L = new Labirinto(10);
			
			L.imprimeLabirinto();
			
			Thread t = new Thread(L);
			t.start();
			
			while(L.naoAchou()) {
				
					String comando = teclado.next();
					L.recebeComando(comando);
				
			}

		}

		

	}
	