package thehuxley;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class escovasDeDente {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int qtdAlunos = s.nextInt();

		final double unEscova = 2.20;
		final double unEscovaComDesconto = 1.46;
		
		double vTotal = 0;
		BigDecimal bd = new BigDecimal(vTotal);
		
		if(qtdAlunos % 2 == 0) {
			vTotal = unEscovaComDesconto * qtdAlunos;
		} 
		
		else if(qtdAlunos % 2 != 0) {
			vTotal = (unEscovaComDesconto * (qtdAlunos - 1)) + unEscova;
		}
		
		System.out.println(BigDecimal.ROUND_HALF_UP(vTotal));
		
		s.close();
		
	}

}
