package ep.solid.srp.test.solucao;

import ep.solid.srp.solucao.entity.Cliente;
import ep.solid.srp.solucao.service.ClienteService;
import org.junit.Test;

import java.time.LocalDate;

public class SrpTestSolucao {

    @Test
    public void testeSrpSolucao() {
        Cliente cliente = new Cliente();
        cliente.setCpf("55563222365");
        cliente.setNome("Marcos Antonio");
        cliente.setDataCadastro(LocalDate.now());
        cliente.setEmail("marcos@gmail.com");

        ClienteService clienteService = new ClienteService();
        try {
            System.out.println(clienteService.adicionarCliente(cliente));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
