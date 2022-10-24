package ep.solid.dip;

import ep.solid.dip.controller.ClienteController;
import ep.solid.dip.entity.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class ApplicationTests {

	@Autowired
	private ClienteController clienteController;

	@Test
	public void contextLoads() {
		Cliente cliente = Cliente.newBuilder()
			.cpf("55588899974")
			.nome("Jhon")
			.email("jhon@gmail.com")
			.dataCadastro(LocalDate.now())
			.build();

		var message = clienteController.adicionarCliente(cliente);
		System.out.println(message);
	}
}
