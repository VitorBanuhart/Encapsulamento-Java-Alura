package exec7;

import java.util.ArrayList;

public class Filme {
    private final String name;
    private ArrayList<Integer> evaluering;

    public Filme(String name) {
        this.name = name;
        this.evaluering = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            evaluering.add(nota);
        } else {
            System.out.println("Nota inválida");
        }
    }

    public double calcularMedia() {
        int soma = 0;
        for(int nota : evaluering) {
            soma += nota;
        }
        return (double) soma / evaluering.size();
    }
    
}
