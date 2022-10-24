package ep.solid.ocp.solucao;

public abstract class DebitoConta {
    public String numeroTransacao;

    public abstract String debitar(Double valor, String conta);

    public String getNumeroTransacao() {
        return numeroTransacao;
    }

    public void setNumeroTransacao(String numeroTransacao) {
        this.numeroTransacao = numeroTransacao;
    }
}
