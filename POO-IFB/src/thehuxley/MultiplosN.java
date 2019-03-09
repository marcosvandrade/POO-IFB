package thehuxley;

import java.util.Scanner;

public class MultiplosN {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int A = s.nextInt();
		int B = s.nextInt();
								
		int i;
		int cont = 0;
		
		if((A > B) || (A == 0) || (B == 0)) {
			
			System.out.println("INEXISTENTE");
			
		} else {
								
				for(i = A; i <= B; i++) {
						
					if(i % N == 0) {
						
						cont = cont + 1;
						System.out.println(i);
						
					}
					
					
				}
				
				if(cont == 0) {
					System.out.println("INEXISTENTE");
				}
				
		}
						
		s.close();
		

	}

}
