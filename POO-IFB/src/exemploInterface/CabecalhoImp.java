package exemploInterface;

public class CabecalhoImp implements ICabecalho{

	@Override
	public String imprimeCabecalho() {
		String txt = "";
		txt += "Instituto Federal de Bras�lia\n";
		txt += "Campus Bras�lia\n";
		txt += "Documento Institucional\n";
		txt += "\n";
		txt += "\n";
		return txt;
	}

}
