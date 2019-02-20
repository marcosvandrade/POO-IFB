//teste git
package thehuxley;

import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		// primeiro menor
		
		if((n1 <= n2) && (n1 < n3)) {
			System.out.println(n1);
		}
		
		if((n2 <= n1) && (n2 < n3)) {
			System.out.println(n2);
		}
		
		if((n3 <= n1) && (n3 < n2)) {
			System.out.println(n3);
		}
		
		// segundo menor
		
		if((n1 <= n2) && (n1 > n3)) {
			System.out.println(n1);
		}
		
		if((n1 <= n3) && (n1 > n2)) {
			System.out.println(n1);
		}
		
		if((n2 <= n1) && (n2 > n3)) {
			System.out.println(n2);
		}
		
		if((n2 <= n3) && (n2 > n1)) {
			System.out.println(n2);
		}
		
		if((n3 <= n1) && (n3 > n2)) {
			System.out.println(n3);
		}
		
		if((n3 <= n2) && (n3 > n1)) {
			System.out.println(n3);
		}
		
		//terceiro menor
		
		if((n1 >= n2) && (n1 > n3)) {
			System.out.println(n1);
		}
		
		if((n2 >= n1) && (n2 > n3)) {
			System.out.println(n2);
		}
		
		if((n3 >= n1) && (n3 > n2)) {
			System.out.println(n3);
		}
		
		s.close();
		
	}

}
