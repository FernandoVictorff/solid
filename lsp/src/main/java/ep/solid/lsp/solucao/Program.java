package ep.solid.lsp.solucao;

public class Program {
    public static void main(String[] args) {
         Quadrado quadrado = new Quadrado(10,10);
         obterAreaRetangulo(quadrado);
    }

    private static void obterAreaRetangulo(Paralelogramo paralelogramo) {
        System.out.println("Calculo da área do Paralelogramo");
        System.out.println();
        System.out.println(paralelogramo.altura + " * " + paralelogramo.largura);
        System.out.println(paralelogramo.area());
    }
}
