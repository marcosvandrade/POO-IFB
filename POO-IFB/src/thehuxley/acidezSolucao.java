package thehuxley;

import java.util.Scanner;

public class acidezSolucao {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		float valor = s.nextFloat();
				
		if((valor >= 1.0) && (valor <= 14.0)) {
		
			if(valor < 7) {
				
				System.out.println("Acida");
				
			}
			
			if(valor > 7) {
				
				System.out.println("Basica");
				
			}
	
			if(valor == 7) {
				
				System.out.println("Neutra");
				
			}
		
		}
			s.close();	
	}

}
