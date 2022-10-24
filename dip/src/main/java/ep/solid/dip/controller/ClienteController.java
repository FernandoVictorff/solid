package ep.solid.dip.controller;

import ep.solid.dip.entity.Cliente;
import ep.solid.dip.service.interfaces.IClienteService;
import org.springframework.stereotype.Controller;

@Controller
public class ClienteController {
    private final IClienteService clienteService;

    public ClienteController(IClienteService clienteService){
        this.clienteService = clienteService;
    }

    public String adicionarCliente(Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }
}
