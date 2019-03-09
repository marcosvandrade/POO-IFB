package thehuxley;
import java.util.Scanner;

//Faça um programa que calcule a área de um retângulo a partir dos tamanhos de seu lado maior e de seu lado menor.

public class AreaDoRetangulo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int lado1 = s.nextInt();
		int lado2 = s.nextInt();
		
		if((lado1 >= 1 && lado1 <= 1000) && (lado2 >= 1 && lado2 <= 1000)) {
			
		int area = lado1 * lado2;
		
		System.out.println(area);
		
		s.close();
		
	} else
		System.out.println("O valor deve estar entre 1 e 1000");

}
}
