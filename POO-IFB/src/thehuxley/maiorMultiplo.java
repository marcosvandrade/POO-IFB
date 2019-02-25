package thehuxley;

import java.util.Scanner;

public class maiorMultiplo {

	public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
		
		int M = s.nextInt();
		int N = s.nextInt();
		
		int maior = 0;
		int cont = 0;
		int i;
		
		if((M > N) || (N == 0) || (M == 0)) {
			
			System.out.println("sem multiplos menores que " + N);
			
		} else {
		
			for(i = 1; i <= N; i++) {
				
				if(i % M == 0) {
					cont = cont + 1;
					if(i >= maior) {
						maior = i;
					}
					if(cont == 0) {
						System.out.println("sem multiplos menores que " + N);
					}
				}
				
			} 
			
		}
		
		if(cont != 0) {
			System.out.println(maior);
		}
		
		s.close();
		
	}
	
	}

