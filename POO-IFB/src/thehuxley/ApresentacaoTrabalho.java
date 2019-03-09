package thehuxley;

import java.util.Scanner;

public class ApresentacaoTrabalho {

	public static void main(String[] args) {
						
		Scanner s = new Scanner(System.in);
		String ent = s.nextLine();
		String[] regra = ent.split(" ");
		String ig = regra[0];
		String ia = regra[1];
		String en = regra[2];
		String in = regra[3];
		String st = regra[4];
		
		if((ig.equals("1") || ia.equals("1")) && (en.equals("1")
				&& in.equals("1")) && st.equals("1")) {
						System.out.println("AVALIADO");
				} else {
			System.out.println(0);
	}
	s.close();				
	}

}

