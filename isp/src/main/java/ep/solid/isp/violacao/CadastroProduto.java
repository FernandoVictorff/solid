package ep.solid.isp.violacao;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CadastroProduto implements ICadastro{
    public void validarDados() {
        // Validar valor
    }

    public void salvarEmail() {
        //Insert tabela Produto
    }

    public void enviarEmail() {
        // Produto não tem email
        throw new RuntimeException("Esse metodo não serve pra nada");
    }
}
