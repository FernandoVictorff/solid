package ep.solid.isp.solucao;

import ep.solid.isp.solucao.interfaces.ICadastroCliente;

public class CadastroCliente implements ICadastroCliente {
    public void validarDados() {
        // validar cpf, email
    }

    public void salvarBanco() {
        // Insert na tabela cliente
    }

    public void enviarEmail() {
        // Enviar e-mail para o cliente
    }
}
