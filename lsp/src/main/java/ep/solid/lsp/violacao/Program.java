package ep.solid.lsp.violacao;

public class Program {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0,5.0);
        obterAreaRetangulo(quadrado);
    }

    private static void obterAreaRetangulo(Retangulo retangulo) {
        System.out.println("Calculo da área do Retangulo");
        System.out.println();
        System.out.println(retangulo.altura + " * " + retangulo.largura);
        System.out.println(retangulo.area());
    }
}
