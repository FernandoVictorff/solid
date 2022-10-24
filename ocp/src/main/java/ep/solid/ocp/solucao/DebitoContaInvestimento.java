package ep.solid.ocp.solucao;

public class DebitoContaInvestimento extends DebitoConta{
    @Override
    public String debitar(Double valor, String conta) {
        // Debita Conta Investimento
        // Isenta taxas
        return numeroTransacao;
    }
}
