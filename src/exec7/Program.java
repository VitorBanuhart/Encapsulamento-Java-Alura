package exec7;

public class Program {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(5);

        System.out.printf("Média de avaliações para %s: %.2f\n", matrix.getName(), matrix.calcularMedia());
    }
}
