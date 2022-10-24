package ep.solid.lsp.solucao;

public abstract class Paralelogramo {
    protected Integer altura;
    protected Integer largura;

    public Paralelogramo(Integer altura, Integer largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public double area() {
        return altura * largura;
    }
}
