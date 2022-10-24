package ep.solid.srp.solucao.service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.util.Properties;

public class EmailService {

    private static final String PATH_EMAIL_PROPERTIES = "src/main/java/ep/solid/srp/solucao/email.properties";
    public static final String USERNAME = "jhon@gmail.com";
    public static final String PASSWORD = "senha-gmail";

    public static boolean isValid(String email) {
        return email.contains("@");
    }

    public static void enviar(String para, String assunto, String mensagem) throws Exception {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream(PATH_EMAIL_PROPERTIES);
        properties.load(file);

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });

        Address[] toUser = InternetAddress.parse(para);
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(para));
        message.setRecipients(Message.RecipientType.TO, toUser);
        message.setSubject(assunto);
        message.setText(mensagem);

        Transport.send(message);
        Thread.sleep(5000);
    }
}
