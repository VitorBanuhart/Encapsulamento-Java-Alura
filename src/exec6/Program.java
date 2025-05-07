package exec6;

public class Program {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana", 0.0);

        conta.depositar(1100.0);
        conta.sacar(1001.0);
        conta.exibirSaldo();
        
    }
}
