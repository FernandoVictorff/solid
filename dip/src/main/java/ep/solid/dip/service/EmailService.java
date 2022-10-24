package ep.solid.dip.service;

import ep.solid.dip.service.interfaces.IEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.util.Properties;

@Service
public class EmailService implements IEmailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);
    private static final String EMAIL_EMPRESA = "empresa@gmail.com";
    private static final String PASSWORD = "senha_mail";
    private static final String PATH_EMAIL_PROPERTIES = "src/main/resources/application.properties";

    @Override
    public boolean isValid(String email) {
        return email.contains("@");
    }

    @Override
    public void enviar(String para, String assunto, String mensagem) {
        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(PATH_EMAIL_PROPERTIES);
            properties.load(file);

            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(EMAIL_EMPRESA, PASSWORD);
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
        } catch (Exception e) {
            LOGGER.error("ERRO NO ENVIO DE EMAIL -> " + e.getMessage());
        }
    }
}
