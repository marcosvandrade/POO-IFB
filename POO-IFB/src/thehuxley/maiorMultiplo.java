package thehuxley;

import java.util.Scanner;

public class maiorMultiplo {

	public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
		
		int M = s.nextInt();
		int N = s.nextInt();
		
		int maior = 0;
		
			for(int i = M; i <= N; i = i + i) {
				
				maior = maior + i;
				
			} 
			
			if(maior == 0) {
				
				System.out.println("sem multiplos menores que " + N);
				
			} else {
				
			System.out.println(maior);
			
			  } 
			
		s.close();
		
	}
	
	}

