package exemploHeitorThreads;

import java.util.Scanner;

public class AulaThreads {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Programa p1 = new Programa();
		Programa p2 = new Programa();
		p1.setId("1");
		p2.setId("2");
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		boolean continua = false;
		do {
			continua = p1.isMetade();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}while(!continua);
		t2.start();
		//p1.setId(teclado.nextLine());
		
	}
	
}
