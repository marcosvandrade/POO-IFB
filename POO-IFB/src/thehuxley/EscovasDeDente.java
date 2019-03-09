package thehuxley;

import java.util.Scanner;

public class EscovasDeDente {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int qtdAlunos = s.nextInt();

		final double unEscova = 2.20;
		double vTotal = 0;
		int cont = 0;
		
		for(int i = 0; i < qtdAlunos; i++) {
			cont++;
			if(cont == 3) {
				cont = 0;
			} else {
				vTotal += unEscova;
			}
		}
		
		System.out.printf("%.2f", vTotal);
		
		s.close();
		
	}

}
