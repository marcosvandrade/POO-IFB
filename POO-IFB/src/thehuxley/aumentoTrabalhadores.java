package thehuxley;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aumentoTrabalhadores {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		float salario = s.nextFloat();
		
		if(salario >= 500) {
			salario = (float) (salario + (salario * 0.1));
		}
		
		if((salario >= 300) && (salario < 500)) {
			salario = (float) (salario + (salario * 0.07));
		}
		
		if((salario < 300) && (salario > 0)) {
			salario = (float) (salario + (salario * 0.05));
		}
		
		
		DecimalFormat resultado = new DecimalFormat("#0.00");
		
		System.out.println(resultado.format(salario));
				
		s.close();
		
	}

}
