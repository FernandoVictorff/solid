package ep.solid.dip.service.interfaces;

public interface IEmailService {
    boolean isValid(String email);

    void enviar(String para, String assunto, String mensagem);
}
