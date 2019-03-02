package thehuxley;

import java.text.DecimalFormat;
import java.util.Scanner;

public class almocoCantina {

	public static void main(String[] args) {
		
		double lasanha = 8.00;
		double estrogonofe = 11.00;
		double refrigerante = 3.00;
		double suco = 2.50;
		
		double totalPagar = 0.0;
		DecimalFormat total = new DecimalFormat("#0.00");
				
		Scanner s = new Scanner(System.in);
		
		String comer = s.next();
		String comerM = comer.toUpperCase();
		
		String beber = s.next();
		String beberM = beber.toUpperCase(); 
				
		if(comerM.equals("LASANHA")) {
			totalPagar += lasanha; 
		}
		
		else if(comerM.equals("ESTROGONOFE")){
			totalPagar += estrogonofe;
		}
		
		if(beberM.equals("REFRIGERANTE")) {
			totalPagar += refrigerante;
		}
		
		else if(beberM.equals("SUCO")) {
			totalPagar += suco;
		}
		
		System.out.println(total.format(totalPagar));
				
		s.close();
		
	}

}
