package exemploInterface;

public class RodapeImpl implements IRodape{

	@Override
	public String imprimeRodape() {
		String txt = "\nDocumento gerado pelo Sistema de Documentos do IFB\n";
		return txt;
	}

}
