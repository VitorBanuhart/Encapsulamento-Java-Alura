package exec3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.next();
        System.out.print("Preco: ");
        Double price = sc.nextDouble();

        Produto p = new Produto(name, price);

        System.out.println(p);

        sc.close();
    }
}
