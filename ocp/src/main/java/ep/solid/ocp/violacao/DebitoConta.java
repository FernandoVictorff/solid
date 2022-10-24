package ep.solid.ocp.violacao;

public class DebitoConta {
    public void debitar(Double valor, String conta, TipoConta tipoConta) {
        if (tipoConta == TipoConta.CORRENTE) {
            // Debita Conta Corrente
        }

        if (tipoConta == TipoConta.POUPANCA) {
            // Valida Aniversario da Conta
            // Debita conta poupanca
        }
    }
}
