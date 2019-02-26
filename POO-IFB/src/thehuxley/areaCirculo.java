package thehuxley;

import java.text.DecimalFormat;
import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double raio = s.nextDouble();
		
		final double PI = 3.14159;
		
		double area = (raio * raio * PI) / 10000;
					
		DecimalFormat resultado = new DecimalFormat("#0.0000");
				
		System.out.println("Area = " + resultado.format(area));
		
		s.close();
		
	}

}
