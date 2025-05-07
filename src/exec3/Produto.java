package exec3;

public class Produto {

    private String name;
    private Double price;

    public Produto(String name, Double price) {
        this.name = name;
        if(price > 0) {
            this.price = price;
        }else {
            this.price = 0.0;
        }
    }

    @Override
    public String toString() {
        if(price >= 0){
            return "Nome: " + name + " \nPreço: " + price;
        }
        return "Preço inválido\n" + "Nome: " + name + " \nPreço: " + price;
    }    

    
}
