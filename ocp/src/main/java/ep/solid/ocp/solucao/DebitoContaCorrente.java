package ep.solid.ocp.solucao;

public class DebitoContaCorrente extends DebitoConta{
    @Override
    public String debitar(Double valor, String conta) {
        return numeroTransacao;
    }
}
