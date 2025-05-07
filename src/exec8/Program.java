package exec8;

public class Program {
    public static void main(String[] args) {
        Acesso acesso = new Acesso();

        acesso.setUserLogin();
        acesso.correctPassword();
        acesso.loginAcess();
    }
}
