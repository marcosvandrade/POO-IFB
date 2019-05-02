package exemploExceptions;

public class ValidadorDeEmail {
	
	public static boolean validarEmail(String email) {
		if (email.contains("@")) {
			return true;
		}else {
			return false;
		}
		
		
	}
	

}
