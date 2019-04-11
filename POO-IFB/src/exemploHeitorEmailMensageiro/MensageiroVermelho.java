package exemploHeitorEmailMensageiro;

public class MensageiroVermelho extends Mensageiro {

	@Override
	public void enviar(String msg) {
		System.err.println(msg);
	}

}
