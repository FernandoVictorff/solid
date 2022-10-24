package ep.solid.dip.service;

import ep.solid.dip.entity.Cliente;
import ep.solid.dip.repository.ClienteRepository;
import ep.solid.dip.service.interfaces.IClienteService;
import ep.solid.dip.service.interfaces.ICpfService;
import ep.solid.dip.service.interfaces.IEmailService;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    private final IEmailService emailService;
    private final ICpfService cpfService;

    public ClienteService(
        ClienteRepository clienteRepository,
        IEmailService emailService,
        ICpfService cpfService
    ) {
        this.clienteRepository = clienteRepository;
        this.emailService = emailService;
        this.cpfService = cpfService;
    }

    @Override
    public String adicionarCliente(Cliente cliente) {
       if (!isValid(cliente.getEmail(), cliente.getCpf())) {
           return "Dados inválidos";
       }

       clienteRepository.adicionarCliente(cliente);
       emailService.enviar(cliente.getEmail(), "Bem vindo!", "Parabéns cadastro concluido com sucesso!");

       return "Dados cadastrados com sucesso!";
    }

    private Boolean isValid(String email, String cpf) {
        return emailService.isValid(email) && cpfService.isValid(cpf);
    }
}
