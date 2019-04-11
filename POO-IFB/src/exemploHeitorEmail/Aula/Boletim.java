package exemploHeitorEmail.Aula;
import java.util.Scanner;

public class Boletim {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtdeNotas;
		String nome, matricula;
		Aluno a;
		System.out.println("Digite o nome:");
		nome = teclado.nextLine();
		System.out.println("Digite a matricula");
		matricula = teclado.nextLine();
		System.out.println("Digite a quantidade de Notas");
		qtdeNotas = Integer.parseInt(teclado.nextLine());
		a = new Aluno(nome, matricula, qtdeNotas);
		for (int i = 0; i < qtdeNotas; i++) {
			System.out.println("Digite a nota "+(i + 1));
			double novaNota = Double.parseDouble(teclado.nextLine());
			a.addNota(novaNota);
		}
		
		System.out.println(a);
		
		if(SistemaAcademico.verificaAprovacao(a)) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		
		
		
		
	}

}
