package exec6;

public class Conta {
    private final String name;
    private Double saldo;


    public Conta(String name, Double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double saldo) {
        this.saldo += saldo;
    }

    public void sacar(Double saque) {
        if (saque > this.saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            this.saldo -= saque;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + this.name + ": " + this.saldo);
    }
}
