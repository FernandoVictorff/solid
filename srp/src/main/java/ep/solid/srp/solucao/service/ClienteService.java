package ep.solid.srp.solucao.service;

import ep.solid.srp.solucao.entity.Cliente;
import ep.solid.srp.solucao.repository.ClienteRepository;

public class ClienteService {

    public static final String ASSUNTO = "Bem Vindo!";
    public static final String MENSAGEM = "Parabéns está Cadastrado";

    public String adicionarCliente(Cliente cliente) throws Exception {
        if (!cliente.isValid()) {
            return "Dados inválidos";
        }

        var repo = new ClienteRepository();
        repo.adicionarCliente(cliente);

        EmailService.enviar(cliente.getEmail(), ASSUNTO, MENSAGEM);
        return "Cliente cadastrado com sucesso";
    }
}
