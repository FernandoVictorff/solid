package ep.solid.lsp.violacao;

public class Quadrado extends Retangulo {
    public Quadrado(Double altura, Double largura) {
        super(altura, largura);
        setAltura(largura);
        setLargura(largura);
    }

    @Override
    public void setAltura(Double altura) {
        super.setAltura(altura);
    }

    @Override
    public void setLargura(Double largura) {
        super.setLargura(largura);
    }
}
