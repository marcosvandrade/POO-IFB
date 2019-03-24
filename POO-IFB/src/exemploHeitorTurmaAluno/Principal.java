package exemploHeitorTurmaAluno;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opt=1;
		Turma turma = new Turma("tsi32421", "POO", 20);
		while(opt!= 0) {
			System.out.println("Escolha uma opcao:");
			System.out.println("1 -  adicionar aluno");
			System.out.println("2 -  remover aluno");
			System.out.println("3 -  listar alunos");
			System.out.println("0 -  Encerrar programa");
			opt = teclado.nextInt();
			teclado.nextLine();
			switch(opt) {
			case 1:
				System.out.println("Digite a matrícula");
				String matricula =  teclado.nextLine();
				System.out.println("Digite o nome");
				String nome =  teclado.nextLine();
				Aluno novoALuno = new Aluno(matricula, nome);
				turma.adicionar(novoALuno);
				break;
			case 2:
				System.out.println("Digite a matricula:");
				String mat = teclado.nextLine();
				turma.remover(mat);
				break;
			case 3:
				turma.listar();
				break;
			}
			
		
		}
		
		teclado.close();
		
		
		
	}
}
