package exec4;

public class Program {
    public static void main(String[] args) {

        Usuario user = new Usuario("123456");
        user.setPsw("12356", "abc123");

        System.out.println(user);
    }
}
