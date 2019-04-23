package exemploInterface;

public class Impressora {
	
	public static void imprimirDocumento(ICabecalho cabecalho, ICorpo corpo, IRodape rodape) {
		System.out.print(cabecalho.imprimeCabecalho());
		System.out.print(corpo.imprimeCorpo());
		System.out.print(rodape.imprimeRodape());
	}
	
}
