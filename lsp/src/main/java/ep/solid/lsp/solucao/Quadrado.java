package ep.solid.lsp.solucao;

public class Quadrado extends Paralelogramo{
    public Quadrado(Integer altura, Integer largura) {
        super(altura, largura);

        if (largura != altura) {
            throw new IllegalArgumentException("Os dois dados do quadrado precisam ser iguais.");
        }
    }
}
