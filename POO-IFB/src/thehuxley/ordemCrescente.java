package thehuxley;

import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
			
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			
			if((a > c) || (b > c)) {
				if(a > b) {
					a = a + c;
					c = a - c;
					a = a - c;
				} else {
					b = b + c;
					c = b - c;
					b = b - c;
				}
				
			}
			
			if (a > b) {
				a = a + b;
				b = a - b;
				a = a - b;
			}
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			s.close();
		
	}

}
