package exemploHeitorEmailMensageiro;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MensageiroPorEmail extends Mensageiro{

	private void enviarEmail(String msg) throws AddressException, MessagingException {
        
        String assunto = "Email do Mensageiro";
        String email = "edilson201611@gmail.com";
         
        String remetente = "pootsi20191@gmail.com";
        System.out.println("__________________________________________________");
        System.out.println("Enviando email DE: " + remetente + " PARA: " + email);
        System.out.println("Assunto: " + assunto);

        Message message = new MimeMessage(criarSessionMail());
        message.setFrom(new InternetAddress(remetente)); // Remetente

        Address[] toUser = InternetAddress // Destinat�rio(s)
                      .parse(email.trim().toLowerCase());

        message.setRecipients(Message.RecipientType.TO, toUser);
        message.setSubject(assunto);// Assunto
        message.setContent(msg, "text/html");
        /** M�todo para enviar a mensagem criada */
        Transport.send(message);

        System.out.println("Email enviado com sucesso !");
        System.out.println("__________________________________________________");

  }
	
	private Session criarSessionMail() {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", 465);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.port", 465);

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {

               protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                      return new PasswordAuthentication("pootsi20191@gmail.com", "senhamuitodificil");
               }
        });

        session.setDebug(true);

        return session;
  }
	
	public static void main(String[] args) throws AddressException, MessagingException {
		MensageiroPorEmail m = new MensageiroPorEmail();
		m.enviarEmail("oi");
	}

	@Override
	public void enviar(String msg) {
		try {
			enviarEmail(msg);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
