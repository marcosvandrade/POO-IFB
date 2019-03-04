package thehuxley;

import java.util.Scanner;

public class apresentacaoTrabalho {

	public static void main(String[] args) {
						
		Scanner s = new Scanner(System.in);
		String ig = s.next();
		String ia = s.next();
		String en = s.next();
		String in = s.next();
		String st = s.next();
		
		if((ig.isEmpty()) || (ia.isEmpty()) || (en.isEmpty()) || (in.isEmpty()) || (st.isEmpty())) {
			System.out.println("0");
		}
		
		
		//if((ig != null) && (ig.trim().length() > 0) || (ia != null) && (ia.trim().length() > 0) || (en != null) && (en.trim().length() > 0) || (in != null) && (in.trim().length() > 0) || (st != null) && (st.trim().length() > 0)) {
			else if((ig.equals("1")) || (ia.equals("1"))) {
				if((en.equals("1")) && (in.equals("1"))) {
					if(st.equals("1")) {
							System.out.println("AVALIADO");
			}	
				}	
		//			}
		} else {
			System.out.println("0");
		}
		s.close();		
	}

}
