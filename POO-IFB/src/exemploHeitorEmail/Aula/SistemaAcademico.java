package exemploHeitorEmail.Aula;

public class SistemaAcademico {

	private static final double mediaEscolar = 6.0;

	public static boolean verificaAprovacao(Aluno aluno) {
		
		double soma = 0, media;
		for (int i = 0; i < aluno.getNotas().length; i++) {
			soma += aluno.getNotas()[i];
		}
		
		media = soma / aluno.getNotas().length;
		
		if(media >= mediaEscolar) {
			return true;
		}
		return false;
		
	}
	
}
