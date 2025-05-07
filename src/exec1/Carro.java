package exec1;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo Cadastrado: \n" + "Modelo: " + modelo + "\nPlaca: " + placa + "\nAno: " + ano;
    }    
}
