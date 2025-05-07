package exec10;

import java.util.ArrayList;

public class Disciplina {
    private final String name;
    private ArrayList<Double> notaValida;
    private ArrayList<Double> notaInvalida;


    public Disciplina(String name) {
        this.name = name;
        this.notaValida = new ArrayList<>();
        this.notaInvalida = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void adicionarNota(Double notaAluno) {
        if (notaAluno >= 0  && notaAluno <= 10) {
            this.notaValida.add(notaAluno);
        }  
        else {
            this.notaInvalida.add(notaAluno);
        }
    }

    public void validasEinvalidas() {
        for (Double invalida : notaInvalida) {
            System.out.println("Nota inválida ignorada: " + invalida);
        }

        System.out.println("Total de notas válidas: " + notaValida.size());
    }

    public void calcularMedia() {
        double notaTotal = 0;
        for (Double media : notaValida) {
             notaTotal += media;
        }

        double media = notaTotal / notaValida.size();
        System.out.printf("Média em " + getName() +": %.2f", media);
    }

}
