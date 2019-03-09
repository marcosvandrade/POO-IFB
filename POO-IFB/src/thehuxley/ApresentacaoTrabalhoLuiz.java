package thehuxley;

import java.util.Scanner;

public class ApresentacaoTrabalhoLuiz {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String entrada = s.nextLine();
		String[] quesitos = entrada.split(" ");
		String interfaceGrafica = quesitos[0];
		String inteligenciaArtificial = quesitos[1];
		String encapsulamento = quesitos[2];
		String indentacao = quesitos[3];
		String usoDeStructs = quesitos[4];
		if ((interfaceGrafica.equals("1") || inteligenciaArtificial.equals("1"))
				&& (encapsulamento.equals("1") && indentacao.equals("1"))
				&& usoDeStructs.equals("1")) {
			System.out.println("AVALIADO");
		} else {
			System.out.println(0);
		}
		s.close();
	}

}
