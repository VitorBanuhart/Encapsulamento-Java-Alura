package exec9;

public class Aluno {
    private final String name;
    private Integer points;

    public Aluno(String name) {
        this.name = name;
    }

    public void ganharPontos(int newPoints) {
        this.points = newPoints;
    }

    public String getName() {
        return name;
    }

    public Integer getPoints() {
        return points;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + getName());
        int totalPoints = getPoints();
        System.out.println("Pontos: " + getPoints());
        if (totalPoints < 100) {
            System.out.println("Nível: 1");
        } else if (totalPoints < 199) {
            System.out.println("Nível: 2");
        } else {
            System.out.println("Nível: 3");
        }
    }


}
