package exec2;

public class Contato {
    private String name;
    private String numero;

    public Contato(String name, String numero) {
        this.name = name;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  name + " - " + numero;
    }   
}
