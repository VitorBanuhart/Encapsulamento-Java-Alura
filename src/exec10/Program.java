package exec10;

public class Program {

    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(9.5);
        matematica.adicionarNota(-9.5);
    
        matematica.validasEinvalidas();
        matematica.calcularMedia();
    }
}