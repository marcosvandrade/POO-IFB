package exemploHeitorEmailMensageiro;

import javax.swing.JOptionPane;

public class MensageiroGUI extends Mensageiro{

	public void enviar(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
}
