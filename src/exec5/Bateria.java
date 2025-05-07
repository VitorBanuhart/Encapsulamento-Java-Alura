package exec5;

public class Bateria {
    private Integer nivelBateria;

    public Bateria(Integer nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public void CargaBateria() {
        if (nivelBateria > 80) {
            System.out.println("Bateria cheia");
        } else if (nivelBateria > 20) {
            System.out.println("Bateria OK");
        } else {
            System.out.println("Bateria fraca");
        }
    } 
}
