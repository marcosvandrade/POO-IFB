package exemploInterface;

public class Principal {
	
	public static void main(String[] args) {
		
		ICabecalho cabecalho = new CabecalhoImp();
		ICorpo corpo = new Estudante("Amaro", "OMV-1443", "TSI", 1988);
		IRodape rodape = new RodapeImpl();
				
		Impressora.imprimirDocumento(cabecalho, corpo, rodape);
		
		corpo = new Professor("Heitor Barros", "342513", "Inform�tica");
		Impressora.imprimirDocumento(cabecalho, corpo, rodape);
		
		corpo = new Laboratorio("212-D", 25, true);
		Impressora.imprimirDocumento(cabecalho, corpo, rodape);
	}

}
