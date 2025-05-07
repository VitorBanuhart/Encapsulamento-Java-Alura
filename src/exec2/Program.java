package exec2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Contato> list = new ArrayList<>();

        list.add(new Contato("João Silva", "(21) 98888-8888"));
        list.add(new Contato("Claudio AAAA", "(21) 98888-8888"));
        list.add(new Contato("Joe ddddddd", "(21) 98888-8888"));


        for(Contato i : list) {
            int count = 1;
            System.out.println(count +" - "+ i);
            count++;
        }
    }
}
