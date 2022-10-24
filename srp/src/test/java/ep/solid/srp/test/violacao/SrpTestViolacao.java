package ep.solid.srp.test.violacao;

import ep.solid.srp.violacao.Cliente;
import org.junit.Test;

import java.time.LocalDate;

public class SrpTestViolacao {

    @Test
    public void cadastrarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Marcos");
        cliente.setEmail("marcos@gmail.com");
        cliente.setCpf("55544422236");
        cliente.setDataCadastro(LocalDate.now());

        try {
            System.out.println(cliente.AdicionarCliente());
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
